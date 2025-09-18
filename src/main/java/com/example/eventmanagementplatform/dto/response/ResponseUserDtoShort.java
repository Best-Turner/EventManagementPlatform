package com.example.eventmanagementplatform.dto.response;

public record ResponseUserDtoShort(Long id, String username, String email, int age) implements ResponseUserDto{
}