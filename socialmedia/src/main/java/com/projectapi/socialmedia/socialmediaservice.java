package com.projectapi.socialmedia;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface socialmediaservice {
    String createUser(User user);

    String updateUser(User user);

    User getUser(String userid);

    String deleteUser(String userid);

    List<User> getAllUserDetails();

    String createPost(Post post);

    String updatePost(Post post);

    Post getPost(String postid);

    String deletePost(String postid);

    List<Post> getAllPostDetails();

    String createComment(Comment comment);

    String updateComment(Comment comment);

    Comment getComment(String commentid);

    String deleteComment(String commentid);

    List<Comment> getAllCommentDetails();
}
