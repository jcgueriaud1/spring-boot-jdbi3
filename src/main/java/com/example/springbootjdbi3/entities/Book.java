package com.example.springbootjdbi3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;

    @NotBlank
    @Size(max = 100)
    private String title;

    private int page;

    private String isbn;

    private String description;

    private double price;
}