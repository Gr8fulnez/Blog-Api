package com.springboot.blog.blog_backend.repository;

import com.springboot.blog.blog_backend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(long id);
}
