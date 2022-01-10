/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Hoang
 */
public class Product implements Serializable{
    private int product_id;
    private String product_name;
    private String product_des;
    private Double product_price;
    private String product_img_source;
    private String product_brand;
    private int quantity;

    public Product() {
    }

    public Product(int product_id, String product_name, String product_des, Double product_price, String product_img_source, String product_brand) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_des = product_des;
        this.product_price = product_price;
        this.product_img_source = product_img_source;
        this.product_brand = product_brand;
    }

    public Product(int product_id, String product_name, String product_des, Double product_price, String product_img_source, String product_brand, int quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_des = product_des;
        this.product_price = product_price;
        this.product_img_source = product_img_source;
        this.product_brand = product_brand;
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_des() {
        return product_des;
    }

    public void setProduct_des(String product_des) {
        this.product_des = product_des;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_img_source() {
        return product_img_source;
    }

    public void setProduct_img_source(String product_img_source) {
        this.product_img_source = product_img_source;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_des=" + product_des + ", product_price=" + product_price + ", product_img_source=" + product_img_source + ", product_brand=" + product_brand + ", quantity=" + quantity + '}';
    }
    
    
    
    
    
}
