package com.cybersoft.food_delivery.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity(name = "order_item")
public class OrderItems {
    @EmbeddedId
    IdOrderItems idOrderItems;
}
