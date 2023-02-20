package com.cybersoft.food_delivery.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "restaurant")
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private int rating;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "restaurants")
    private Set<RatingRes> ratingRes;

    @OneToMany(mappedBy = "restaurants")
    private Set<CategoryRes> categoryRes;

    public Set<CategoryRes> getCategoryRes() {
        return categoryRes;
    }

    public void setCategoryRes(Set<CategoryRes> categoryRes) {
        this.categoryRes = categoryRes;
    }

    public Set<RatingRes> getRatingRes() {
        return ratingRes;
    }

    public void setRatingRes(Set<RatingRes> ratingRes) {
        this.ratingRes = ratingRes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
