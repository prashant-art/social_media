package com.projectapi.socialmedia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
@Entity
@Table(name = "user_info")
public class User {
    @Id
    private String userid;
    private String username;
    private String password;

    public User() {
    }

    public User(String userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

@Entity
@Table(name = "user_post_info")
class Post {
    @Id
    private String postid;
    private String userid;
    private String content;
    private Timestamp timestamp;

    public Post() {
    }

    public Post(String postid, String userid, String content, Timestamp timestamp) {
        this.postid = postid;
        this.userid = userid;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

@Entity
@Table(name = "user_comment_info")
class Comment {
    @Id
    private String commentid;
    private String userid;
    private String content;
    private Timestamp timestamp;

    public Comment() {
    }

    public Comment(String commentid, String userid, String content, Timestamp timestamp) {
        this.commentid = commentid;
        this.userid = userid;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
