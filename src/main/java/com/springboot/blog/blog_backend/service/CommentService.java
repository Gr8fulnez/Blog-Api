package com.springboot.blog.blog_backend.service;

import com.springboot.blog.blog_backend.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentByPostId(long postId);

    CommentDto getCommentById(Long postId, Long commentId );

    void deleteComment(Long postId, Long commentId);
}
