package com.example.n1.controller;

import com.example.n1.dto.UserDTO;
import com.example.n1.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDTO>> getTopTenUsers(@PathVariable Long id) {
        return ResponseEntity.ok(postService.getTopTenUsersPerPost(id));
    }
}
