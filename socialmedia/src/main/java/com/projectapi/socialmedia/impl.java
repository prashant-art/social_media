package com.projectapi.socialmedia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impl implements socialmediaservice {

    private final UserRepository urepo;
    private final PostRepository prepo;
    private final CommentRepository crepo;

    @Autowired
    public impl(UserRepository urepo, PostRepository prepo, CommentRepository crepo) {
        this.urepo = urepo;
        this.prepo = prepo;
        this.crepo = crepo;
    }

    @Override
    public String updateUser(User user) {
        urepo.save(user);
        return "User updated successfully";
    }

    @Override
    public User getUser(String userid) {
        Optional<User> optionalUser = urepo.findById(userid);
        return optionalUser.orElse(null);
    }

    @Override
    public String deleteUser(String userid) {
        urepo.deleteById(userid);
        return "User deleted successfully";
    }

    @Override
    public List<User> getAllUserDetails() {
        return (List<User>) urepo.findAll();
    }

    @Override
    public String updatePost(Post post) {
        prepo.save(post);
        return "Post updated successfully";
    }

    @Override
    public Post getPost(String postid) {
        Optional<Post> optionalPost = prepo.findById(postid);
        return optionalPost.orElse(null);
    }

    @Override
    public String deletePost(String postid) {
        prepo.deleteById(postid);
        return "Post deleted successfully";
    }

    @Override
    public List<Post> getAllPostDetails() {
        return (List<Post>) prepo.findAll();
    }

    @Override
    public String updateComment(Comment comment) {
        crepo.save(comment);
        return "Comment updated successfully";
    }

    @Override
    public Comment getComment(String commentid) {
        Optional<Comment> optionalComment = crepo.findById(commentid);
        return optionalComment.orElse(null);
    }

    @Override
    public String deleteComment(String commentid) {
        crepo.deleteById(commentid);
        return "Comment deleted successfully";
    }

    @Override
    public String createUser(User user) {
        urepo.save(user);
        return "User created successfully";
    }

    @Override
    public String createPost(Post post) {
        prepo.save(post);
        return "Post created successfully";
    }

    @Override
    public String createComment(Comment comment) {
        crepo.save(comment);
        return "Comment created successfully";
    }

    @Override
    public List<Comment> getAllCommentDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCommentDetails'");
    }
}
