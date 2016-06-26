package com.egfavre.services;

import com.egfavre.entities.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 6/26/16.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
