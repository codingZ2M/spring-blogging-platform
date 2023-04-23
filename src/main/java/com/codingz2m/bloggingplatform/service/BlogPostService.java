package com.codingz2m.bloggingplatform.service;


import java.util.List;
import com.codingz2m.bloggingplatform.model.BlogPost;

public interface BlogPostService {
    List<BlogPost> findAll();
    BlogPost findById(Long id);
    BlogPost save(BlogPost blogPost);
    void deleteById(Long id);
}
