package com.springboot.blog.blog_backend.repository;

import com.springboot.blog.blog_backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Rolerepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
