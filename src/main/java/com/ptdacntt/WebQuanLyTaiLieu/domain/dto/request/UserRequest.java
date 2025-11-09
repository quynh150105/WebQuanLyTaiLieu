package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.request;

import com.ptdacntt.WebQuanLyTaiLieu.constraints.Roles;
import com.ptdacntt.WebQuanLyTaiLieu.constraints.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Date dob;

}
