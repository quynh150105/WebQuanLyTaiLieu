package com.ptdacntt.WebQuanLyTaiLieu.domain.entity;

import com.ptdacntt.WebQuanLyTaiLieu.constraints.Roles;
import com.ptdacntt.WebQuanLyTaiLieu.constraints.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Date dob;
    private Status status;
    private Roles role;
    private String dataUrl;
}
