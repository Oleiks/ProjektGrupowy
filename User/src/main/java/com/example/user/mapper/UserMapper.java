package com.example.user.mappers;
import com.example.user.dto.UserDto;
import com.example.user.entity.User;
import org.mapstruct.Mapper;
// This class has essentially the same role as 'functionTo'
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}
