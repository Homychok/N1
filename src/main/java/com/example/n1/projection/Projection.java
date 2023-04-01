package com.example.n1.projection;

import com.example.n1.dto.UserDTO;

public interface Projection {
    Long getUserId();
    String getUserName();
    Long getAllPostCount();
    Long getAllCommentsCount();
    Long getLastPostId();
//    public static  Projection toProjection (UserDTO userDTO) {
//        Projection projection = new Projection();
//        projection.setId(userDTO.getUserId());
//        projection.setUserName(userDTO.getUserName());
//        projection.setCountPosts(userDTO.getAllPostCount());
//        projection.setCountComments(userDTO.getAllCommentsCount());
//        projection.setLatestPostId(userDTO.getLastPostId());
//
//        return projection;
//    }

    public default UserDTO fromProgectionToUserDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(getUserId());
        userDTO.setUserName(getUserName());
        userDTO.setCountPosts(getAllPostCount());
        userDTO.setCountComments(getAllCommentsCount());
        userDTO.setLatestPostId(getLastPostId());
        return userDTO;
    }

}
