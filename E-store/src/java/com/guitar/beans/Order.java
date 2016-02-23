/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guitar.beans;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Danny
 */
public class Order {
    private int orderID;
    private LinkedList<Product> shoppingCart;
    private Date orderDate;
    private boolean isPaid = false;

    public Order() {
    }
    
    public Order(int orderID, LinkedList<Product> shoppingCart, Date orderDate) {
        this.orderID = orderID;
        this.shoppingCart = shoppingCart;
        this.orderDate = orderDate;
    }

    /*
     *@return the total price of the items in shopping cart including quantity.
     */
    public double getTotal(){
        double total = 0;
        total = getShoppingCart().stream().map((p) -> p.getPrice() * p.getQuantity()).reduce(total, (accumulator, _item) -> accumulator + _item);
        return total;
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the shoppingCart
     */
    public LinkedList<Product> getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the shoppingCart to set
     */
    public void setShoppingCart(LinkedList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the isPaid
     */
    public boolean isIsPaid() {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    
    
}
