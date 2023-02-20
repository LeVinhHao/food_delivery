package com.cybersoft.food_delivery.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name ="category_restaurant")
public class CategoryRes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "restau_id")
    private Restaurants restaurants;

    @OneToMany(mappedBy = "categoryRes")
    private Set<Coupon> coupons;

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurants getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurants restaurants) {
        this.restaurants = restaurants;
    }
}
