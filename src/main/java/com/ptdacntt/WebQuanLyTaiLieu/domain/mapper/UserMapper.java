package com.ptdacntt.WebQuanLyTaiLieu.domain.mapper;

import com.ptdacntt.WebQuanLyTaiLieu.domain.dto.request.UserRequest;
import com.ptdacntt.WebQuanLyTaiLieu.domain.dto.response.UserResponse;
import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest request);
    UserResponse toUserResponse(User user);
    List<UserResponse> toListUserResponse(List<User> list);
}
