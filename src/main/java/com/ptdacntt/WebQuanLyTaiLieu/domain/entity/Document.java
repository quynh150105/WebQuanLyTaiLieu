package com.ptdacntt.WebQuanLyTaiLieu.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private String description;
    private Date datePublication;
    private int price;
    private int pageNumber;
    @ManyToOne
    @JoinColumn(name= "author_id")
    private Author author;

    @OneToMany(mappedBy = "document")
    private List<Comment> commentList;

    @ManyToOne
    @JoinColumn(name= "category_id")
    private Category category;


}
