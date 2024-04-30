package com.example.demo.user.mapper;
import com.example.demo.user.entity.User;
import com.example.demo.user.dto.SignUpDto;
import com.example.demo.user.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

// This class has essentially the same role as 'functionTo'
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target ="password", ignore = true) // because the types are different, char and String
    User signUpToUser(SignUpDto signUpDto);
}
