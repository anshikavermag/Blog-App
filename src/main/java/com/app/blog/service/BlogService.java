package com.app.blog.service;

import com.app.blog.model.Blog;
import com.app.blog.repo.BlogRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepo blogRepo;

    public List<Blog> getAllBlogs(){
        return blogRepo.findAll();
    }
}
