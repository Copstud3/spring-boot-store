package com.chrisgmi.store.mappers;


import com.chrisgmi.store.dtos.RegisterUserDto;
import com.chrisgmi.store.dtos.UpdateUserRequest;
import com.chrisgmi.store.dtos.UserDto;
import com.chrisgmi.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserDto request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
