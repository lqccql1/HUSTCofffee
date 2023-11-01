package com.ecommerce.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {
    private String firstName;
    private String lastName;
    private String username;
    @Size(min = 6, max = 15, message = "Password should have 6-15 characters")
    private String password;
    private String repeatPassword;
}
