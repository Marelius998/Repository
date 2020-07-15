package com.example.demo_code9prj.controler;

import com.example.demo_code9prj.models.Authority;
import com.example.demo_code9prj.repository.AuthorityRepository;
import com.example.demo_code9prj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/authority")
public class AuthorityController
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    private Logger logger = Logger.getLogger(getClass().getName());

    @PostMapping
    public Authority getAuthority(@RequestBody String username)
    {
        logger.info(username);
        return authorityRepository.getOne(username);
    }

}
