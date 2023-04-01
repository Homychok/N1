package com.example.n1.dto;

import com.example.n1.model.Post;
import lombok.Data;

@Data
public class PostDTO {

    private Long id;
    private String title;
    private String body;

    public static PostDTO fromPostToPostDTO (Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setBody(post.getBody());
        return postDTO;
    }
    public Post toPost () {
        Post post = new Post();
        post.setId(this.getId());
        post.setTitle(this.getTitle());
        post.setBody(this.getBody());
        return post;
    }

}
