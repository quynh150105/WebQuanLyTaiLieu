package com.ptdacntt.WebQuanLyTaiLieu.controller;

import com.ptdacntt.WebQuanLyTaiLieu.domain.dto.response.UserResponse;
import com.ptdacntt.WebQuanLyTaiLieu.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name="User Controller")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
       this.service = service;
    }

    @Operation(summary="add User",description="API create new User") // mo ta chi tiet cho tung API
    @GetMapping("")
    public List<UserResponse> getAllUser(){
        return service.getAllUser();
    }
}
