package com.ptdacntt.WebQuanLyTaiLieu.service;

import com.ptdacntt.WebQuanLyTaiLieu.domain.dto.response.UserResponse;
import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.User;
import com.ptdacntt.WebQuanLyTaiLieu.domain.mapper.UserMapper;
import com.ptdacntt.WebQuanLyTaiLieu.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserService(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<UserResponse> getAllUser(){
        return mapper.toListUserResponse(repository.findAll());
    }
}
