package com.codingz2m.bloggingplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingz2m.bloggingplatform.model.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
	
}
