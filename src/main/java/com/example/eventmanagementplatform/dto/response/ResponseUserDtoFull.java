package com.example.eventmanagementplatform.dto.response;

import java.time.LocalDateTime;

public record ResponseUserDtoFull(Long id, String username, String firstname, String lastname, String email,
                                  String role, int age, LocalDateTime createAt) implements ResponseUserDto {
}
