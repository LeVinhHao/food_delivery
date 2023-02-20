package com.cybersoft.food_delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Embeddable
public class IdOrderItems implements Serializable {
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "food_id")
    private int foodId;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public IdOrderItems() {
    }

    public IdOrderItems(int orderId, int foodId, int amount, float price) {
        this.orderId = orderId;
        this.foodId = foodId;
        this.amount = amount;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
