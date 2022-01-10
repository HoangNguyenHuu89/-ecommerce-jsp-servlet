/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang
 */
public class Cart implements Serializable{
   private Product items;
   private int quantity; 

    public Cart() {
    }

    public Cart(Product items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public Product getItems() {
        return items;
    }

    public void setItems(Product items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
   
    
}
