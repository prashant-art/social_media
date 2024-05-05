package com.projectapi.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socialmedia")
public class apicontroller {

    private final socialmediaservice service;

    @Autowired
    public apicontroller(socialmediaservice service) {
        this.service = service;
    }

    // User endpoints

    @GetMapping("/user/{userid}") // Read data for a user by ID from the database
    public User getUserDetails(@PathVariable("userid") String userid) {
        return service.getUser(userid);
    }

    @GetMapping("/users") // Read all user data from the database
    public List<User> getAllUserDetails() {
        return service.getAllUserDetails();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        service.createUser(user);
        return "User created successfully";
    }

    @PutMapping("/user")
    public String updateUserDetails(@RequestBody User user) {
        service.updateUser(user);
        return "User updated successfully";
    }

    @DeleteMapping("/user/{userid}")
    public String deleteUserDetails(@PathVariable("userid") String userid) {
        service.deleteUser(userid);
        return "User deleted successfully";
    }

    // Post endpoints
   
    @GetMapping("/post/{postid}") // Read data for a post by ID from the database
public Post getPostDetails(@PathVariable("postid") String postid) {
    return service.getPost(postid);
}

@GetMapping("/posts") // Read all post data from the database
public List<Post> getAllPostDetails() {
    return service.getAllPostDetails();
}

@PostMapping("/post")
public String createPost(@RequestBody Post post) {
    service.createPost(post);
    return "Post created successfully";
}

@PutMapping("/post")
public String updatePostDetails(@RequestBody Post post) {
    service.updatePost(post);
    return "Post updated successfully";
}

@DeleteMapping("/post/{postid}")
public String deletePostDetails(@PathVariable("postid") String postid) {
    service.deletePost(postid);
    return "Post deleted successfully";
}


    // Similar endpoints  Comment

    @GetMapping("/comment/{commentid}") // Read data for a comment by ID from the database
    public Comment getCommentDetails(@PathVariable("commentid") String commentid) {
        return service.getComment(commentid);
    }
    
    @GetMapping("/comments") // Read all comment data from the database
    public List<Comment> getAllCommentDetails() {
        return service.getAllCommentDetails();
    }
    
    @PostMapping("/comment")
    public String createComment(@RequestBody Comment comment) {
        service.createComment(comment);
        return "Comment created successfully";
    }
    
    @PutMapping("/comment")
    public String updateCommentDetails(@RequestBody Comment comment) {
        service.updateComment(comment);
        return "Comment updated successfully";
    }
    
    @DeleteMapping("/comment/{commentid}")
    public String deleteCommentDetails(@PathVariable("commentid") String commentid) {
        service.deleteComment(commentid);
        return "Comment deleted successfully";
    }




}
