package com.pizzabff.projectbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "PizzaOrders")
public class PizzaOrder {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private Long id;

    @Column(name = "holderName")
    private String holderName;

    @Column(name = "orderPizza")
    private String orderPizza;

    @Column(name = "quantity")
    private String quantity;

    public PizzaOrder() {
        super();
    }

    public PizzaOrder(String orderPizza, String holderName, String quantity) {
        super();
        this.quantity = quantity;
        this.orderPizza = orderPizza;
        this.holderName = holderName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getOrderPizza() {
        return orderPizza;
    }

    public void setOrderPizza(String orderPizza) {
        this.orderPizza = orderPizza;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
