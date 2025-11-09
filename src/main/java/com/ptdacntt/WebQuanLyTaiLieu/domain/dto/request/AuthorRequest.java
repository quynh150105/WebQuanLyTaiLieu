package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.request;

import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.Document;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorRequest {
    private String id;
    private String name;
    private Date dob;
}
