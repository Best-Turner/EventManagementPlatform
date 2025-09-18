package com.example.eventmanagementplatform.service;

import java.util.List;

public interface EntityService<RequestDto, ResponseDto, K> {

    ResponseDto create(RequestDto dto);

    ResponseDto getById(K key);

    List<ResponseDto> getAll();

    ResponseDto update(K key, ResponseDto updated);

    void delete(K key);

}
