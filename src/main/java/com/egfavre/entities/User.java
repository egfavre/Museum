package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 6/26/16.
 */
@Entity
@Table (name="users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String username;

    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    String firstname;

    @Column(nullable = false)
    String lastname;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String state;

    @Column(nullable = false)
    int zipcode;

    @Column(nullable = false)
    String phone;

    @Column(nullable = false)
    String email;

//    Boolean isSubscribed;
//    Boolean isEvents;
//    Boolean isVolunteer;
//    Boolean isDonate;

    public User(String username, String password, String firstname, String lastname, String address, String city, String state, int zipcode, String phone, String email) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public User(String username, String password, String firstname, String lastname, String address, String city, int zipcode, String phone, String email, Boolean isSubscribed, Boolean isEvents, Boolean isVolunteer, Boolean isDonate) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
//        this.isSubscribed = isSubscribed;
//        this.isEvents = isEvents;
//        this.isVolunteer = isVolunteer;
//        this.isDonate = isDonate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //    public Boolean getSubscribe() {
//        return isSubscribed;
//    }
//
//    public void setSubscribe(Boolean subscribe) {
//        this.isSubscribed = subscribe;
//    }
//
//    public Boolean getSubscribed() {
//        return isSubscribed;
//    }
//
//    public void setSubscribed(Boolean subscribed) {
//        isSubscribed = subscribed;
//    }
//
//    public Boolean getEvents() {
//        return isEvents;
//    }
//
//    public void setEvents(Boolean events) {
//        isEvents = events;
//    }
//
//    public Boolean getVolunteer() {
//        return isVolunteer;
//    }
//
//    public void setVolunteer(Boolean volunteer) {
//        isVolunteer = volunteer;
//    }
//
//    public Boolean getDonate() {
//        return isDonate;
//    }
//
//    public void setDonate(Boolean donate) {
//        isDonate = donate;
//    }
}
