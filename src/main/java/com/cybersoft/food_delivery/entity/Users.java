package com.cybersoft.food_delivery.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name ="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;


    @OneToMany(mappedBy = "users")
    private Set<RatingRes> ratingRes;

    @OneToMany(mappedBy = "users")
    private Set<RatingFoods> ratingFoods;

    @OneToMany(mappedBy = "users")
    private Set<Orders> orders;

    @OneToMany(mappedBy = "users")
    private Set<RatingOrders> ratingOrders;

    public Set<RatingOrders> getRatingOrders() {
        return ratingOrders;
    }

    public void setRatingOrders(Set<RatingOrders> ratingOrders) {
        this.ratingOrders = ratingOrders;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<RatingFoods> getRatingFoods() {
        return ratingFoods;
    }

    public void setRatingFoods(Set<RatingFoods> ratingFoods) {
        this.ratingFoods = ratingFoods;
    }

    public Set<RatingRes> getRatingRes() {
        return ratingRes;
    }

    public void setRatingRes(Set<RatingRes> ratingRes) {
        this.ratingRes = ratingRes;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
