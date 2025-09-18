package com.example.eventmanagementplatform.service;

import com.example.eventmanagementplatform.dto.request.RequestUserDto;
import com.example.eventmanagementplatform.dto.response.ResponseUserDto;

public interface UserService extends EntityService<RequestUserDto, ResponseUserDto, Long> {
}
