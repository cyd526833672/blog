package com.fs.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 */
@Entity(name = "t_document")
public class Document implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long title;
    @Column(nullable = true)
    private String discription;
    @Column(nullable = true)
    private String createTime;
    @Column(nullable = true)
    private String lastUpdateTime;
}
