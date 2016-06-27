package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 6/26/16.
 */
@Entity
@Table (name="comments")
public class Comment {
    @GeneratedValue
    @Id
    int commentId;

    @Column(nullable = false)
    String comment;

    @Column(nullable = false)
    String author;

    @ManyToOne
    User user;

    @ManyToOne
    Picture picture;

    public Comment() {
    }

    public Comment(String comment, String author, User user, Picture picture) {
        this.comment = comment;
        this.author = author;
        this.user = user;
        this.picture = picture;
    }

    public Comment(int commentId, String comment, String author, User user, Picture picture) {
        this.commentId = commentId;
        this.comment = comment;
        this.author = author;
        this.user = user;
        this.picture = picture;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}