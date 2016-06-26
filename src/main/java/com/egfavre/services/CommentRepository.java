package com.egfavre.services;

import com.egfavre.entities.Comment;
import com.egfavre.entities.Picture;
import com.egfavre.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 6/26/16.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
    public Iterable<Comment> findByUser(User user);
    public Iterable<Comment> findByPicture(Picture picture);

}
