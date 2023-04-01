package com.example.n1.service;

import com.example.n1.dto.UserDTO;
import com.example.n1.projection.Projection;
import com.example.n1.repository.CommentRepository;
import com.example.n1.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class PostService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<UserDTO> getTopTenUsersPerPost(Long id) {
//        if (postRepository.findById(id) == null) {
//            throw new RuntimeException;}
        List<Projection> users = postRepository.findTopTenUsers(id);
        return users.stream().map(Projection::fromProgectionToUserDTO)
                .collect(Collectors.toList());
    }
}
