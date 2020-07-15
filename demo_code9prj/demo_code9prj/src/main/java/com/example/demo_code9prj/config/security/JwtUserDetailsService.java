package com.example.demo_code9prj.config.security;

import com.example.demo_code9prj.models.User;
import com.example.demo_code9prj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(returnUser ->
                        new org.springframework.security.core.userdetails.User(returnUser.getUsername(), returnUser.getPassword(), new ArrayList<>()))
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with username: " + username));

    }

    public User save(User user) {
        User newUser = User.builder()
                .username(user.getUsername())
                .password(bcryptEncoder.encode(user.getPassword()))
                .build();
        return userRepository.save(newUser);
    }

}