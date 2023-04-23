package com.codingz2m.bloggingplatform.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingz2m.bloggingplatform.model.BlogPost;
import com.codingz2m.bloggingplatform.repository.BlogPostRepository;
import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public BlogPost findById(Long id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    @Override
    public BlogPost save(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    @Override
    public void deleteById(Long id) {
        blogPostRepository.deleteById(id);
    }
}
