package com.springboot.blog.blog_backend.service;

import com.springboot.blog.blog_backend.payload.PostDto;
import com.springboot.blog.blog_backend.payload.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
