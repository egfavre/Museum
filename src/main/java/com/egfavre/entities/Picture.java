package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 6/24/16.
 */
@Entity
@Table(name = "pictures")
public class Picture {
    @GeneratedValue
    @Id
    int id;

    @Column(nullable = false)
    String source;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String url;

    @Column(nullable = false)
    String artist;

    @Column(nullable = false, length = 1000)
    String description;

    public Picture() {
    }

    public Picture(String source, String title, String url, String artist, String description) {
        this.source = source;
        this.title = title;
        this.url = url;
        this.artist = artist;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
