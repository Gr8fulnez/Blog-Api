package com.springboot.blog.blog_backend.repository;

import com.springboot.blog.blog_backend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
