package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.response;

import com.ptdacntt.WebQuanLyTaiLieu.domain.entity.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentResponse {
    private String content;
    private LocalDateTime createAt;

}
