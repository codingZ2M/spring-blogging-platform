package com.codingz2m.bloggingplatform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codingz2m.bloggingplatform.model.BlogPost;
import com.codingz2m.bloggingplatform.service.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/api/blog-posts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    @Autowired
    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @GetMapping
    public List<BlogPost> findAll() {
        return blogPostService.findAll();
    }

    @GetMapping("/{id}")
    public BlogPost findById(@PathVariable Long id) {
        BlogPost blogPost = blogPostService.findById(id);
        	return blogPost;
    }

    @PostMapping
    public BlogPost save(@RequestBody BlogPost blogPost) {
        return blogPostService.save(blogPost);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        blogPostService.deleteById(id);
    }
}

