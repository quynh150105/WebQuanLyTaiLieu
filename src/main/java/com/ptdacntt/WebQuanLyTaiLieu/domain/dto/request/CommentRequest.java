package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.request;

import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.Document;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentRequest {
    private String content;
    private LocalDateTime createAt;

}
