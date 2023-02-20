package com.cybersoft.food_delivery.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "food")
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @OneToMany(mappedBy = "foods")
    private Set<RatingFoods> ratingFoods;

    public Set<RatingFoods> getRatingFoods() {
        return ratingFoods;
    }

    public void setRatingFoods(Set<RatingFoods> ratingFoods) {
        this.ratingFoods = ratingFoods;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
