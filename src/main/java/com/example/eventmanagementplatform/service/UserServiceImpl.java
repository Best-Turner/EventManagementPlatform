package com.example.eventmanagementplatform.service;

import com.example.eventmanagementplatform.dto.request.RequestUserDto;
import com.example.eventmanagementplatform.dto.response.ResponseUserDto;
import com.example.eventmanagementplatform.repositiry.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public ResponseUserDto create(RequestUserDto requestUserDto) {
        return null;
    }

    @Override
    public ResponseUserDto getById(Long key) {
        return null;
    }

    @Override
    public List<ResponseUserDto> getAll() {
        return null;
    }

    @Override
    public ResponseUserDto update(Long key, ResponseUserDto updated) {
        return null;
    }

    @Override
    public void delete(Long key) {

    }
}
