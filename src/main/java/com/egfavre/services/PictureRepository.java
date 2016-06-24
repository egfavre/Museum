package com.egfavre.services;

import com.egfavre.entities.Picture;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 6/24/16.
 */
public interface PictureRepository extends CrudRepository<Picture, Integer> {
}
