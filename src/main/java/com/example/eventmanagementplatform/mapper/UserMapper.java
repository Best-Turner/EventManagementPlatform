package com.example.eventmanagementplatform.mapper;

import com.example.eventmanagementplatform.dto.request.RequestRegistrationUserDto;
import com.example.eventmanagementplatform.dto.response.ResponseUserDtoFull;
import com.example.eventmanagementplatform.dto.response.ResponseUserDtoShort;
import com.example.eventmanagementplatform.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", ignore = true)
    @Mapping(target = "createAt", ignore = true)
    @Mapping(target = "registrations", ignore = true)
    @Mapping(target = "organizedEvents", ignore = true)
    User toUser(RequestRegistrationUserDto requestUserDto);

    ResponseUserDtoShort toShortDto(User user);

    @Mapping(target = "role", expression = "java(user.getRole().getRoleAsString()")
    ResponseUserDtoFull toFullDto(User user);


}

