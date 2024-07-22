package com.springboot.blog.blog_backend.service;

import com.springboot.blog.blog_backend.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
