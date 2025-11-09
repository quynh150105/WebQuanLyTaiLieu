package com.ptdacntt.WebQuanLyTaiLieu.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String content;
    private LocalDateTime createAt;
    @ManyToOne
    private Document document;
    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;
}
