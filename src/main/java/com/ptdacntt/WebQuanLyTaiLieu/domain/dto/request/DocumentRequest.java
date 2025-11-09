package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentRequest {
    private String title;
    private String description;
    private Date datePublication;
    private int price;
    private int pageNumber;
}
