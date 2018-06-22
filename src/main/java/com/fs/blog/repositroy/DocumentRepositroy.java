package com.fs.blog.repositroy;

import com.fs.blog.entity.Document;
import org.aspectj.apache.bcel.util.Repository;

public interface DocumentRepositroy extends Repository {
    Document findBytitle(String title);

}