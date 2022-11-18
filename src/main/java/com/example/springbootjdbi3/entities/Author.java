package com.example.springbootjdbi3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private Long id;

    @NotBlank
    private String lastname;

    private String firstname;

}