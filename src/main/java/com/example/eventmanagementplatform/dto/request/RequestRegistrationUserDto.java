package com.example.eventmanagementplatform.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequestRegistrationUserDto(
        @NotBlank(message = "Username cannot be empty")
        @Size(min = 3, max = 50, message = "Username must be between 3 and 50 character long")
        String username,
        @NotBlank(message = "Firstname is not be empty")
        @Size(min = 2, max = 50, message = "Firstname must be between 2 and 50 character long")
        String firstName,
        @NotBlank(message = "Lastname is not be empty")
        @Size(min = 2, max = 50, message = "Lastname must be between 2 and 50 character long")
        String lastName,
        @NotBlank(message = "Email is required")
        @Email(message = "Email should be valid")
        String email,
        @NotBlank(message = "Password cannot be empty")
        @Size(min = 8, message = "The password must be at least 8 characters long")
        String password) implements RequestUserDto {
}
