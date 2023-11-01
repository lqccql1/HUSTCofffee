package com.ecommerce.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerDto {
    private String firstName;

    private String lastName;

    private String username;

    @Size(min = 6, max = 20, message = "Password should have 6-20 characters")
    private String password;

    private String repeatPassword;
}
