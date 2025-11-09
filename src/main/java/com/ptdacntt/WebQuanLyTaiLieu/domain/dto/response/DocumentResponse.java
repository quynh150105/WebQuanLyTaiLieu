package com.ptdacntt.WebQuanLyTaiLieu.domain.dto.response;
import com.ptdacntt.WebQuanLyTaiLieu.constraints.Types;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentResponse {
    private String title;
    private Types type;
}
