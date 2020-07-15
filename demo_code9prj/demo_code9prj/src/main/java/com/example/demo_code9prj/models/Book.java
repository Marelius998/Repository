package com.example.demo_code9prj.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private BigDecimal price;

    private int inStock;

    private boolean available;

    @ManyToOne
    private Genre genre;


    @ManyToOne
    private Author author;

}
