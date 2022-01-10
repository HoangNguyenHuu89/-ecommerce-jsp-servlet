/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Cart;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang
 */
public class Order {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void SaveDB(List<Cart> cart, String name,String address,String discount) {
         String query =  "insert  Orders (user_mail, order_status, order_date, order_discount_code, order_address) values (?,1,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
     
            java.util.Date curDate = new java.util.Date();
            java.sql.Date date = new java.sql.Date(curDate.getTime());
            ps.setDate(2,date);
            ps.setString(3, discount);
            ps.setString(4, address);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            int orderId =0;
            if(rs.next()) {
                orderId = rs.getInt(1);
                SaveDBDetail(orderId,cart);
            }
            
            rs.close();
            ps.close();
        } catch (Exception e) {
        }
     
    }
    public void SaveDBDetail(int orderID, List<Cart> cart) {
          try {
              for (Cart item : cart) {
             String query = "insert into  Orders_detail (order_id, product_id, amount_product, price_product)"
              + "values (?,?,?,?)";
            conn = new DBContext().getConnection();
             ps = conn.prepareStatement(query);
             ps.setInt(2, item.getItems().getProduct_id());
             ps.setInt(1, orderID);
             ps.setInt(3, item.getQuantity());
             ps.setDouble(4,item.getQuantity() * item.getItems().getProduct_price());
             ps.executeUpdate();
              }
              rs.close();
              ps.close();
        } catch (Exception e) {
        }
    }
}
