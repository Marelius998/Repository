package com.example.demo_code9prj.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String name;

    @OneToMany(mappedBy = "genre" )
    @JsonIgnore
    private Set<Book> books;

}
