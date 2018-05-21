package com.fs.blog.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_document")
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long title;
    @Column(nullable=true)
    private String discription;
    @Column(nullable=true)
    private String createTime;
    @Column(nullable=true)
    private String lastUpdateTime;
}
