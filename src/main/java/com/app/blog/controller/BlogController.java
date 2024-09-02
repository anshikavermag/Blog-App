package com.app.blog.controller;


import com.app.blog.model.Blog;
import com.app.blog.service.BlogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/blog")
public class BlogController {

    private final BlogService blogService;

    @GetMapping("get-all")
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }


}
