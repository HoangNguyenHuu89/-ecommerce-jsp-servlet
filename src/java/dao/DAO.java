/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Product> getAll() {
        String query = "select * from Products";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public Product getProductbyID(String txt) {
        String query = "select * from Products where product_id = ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public Product getProduct(int pid) {
        Product result = null;
        String query = "select * from Products where product_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
               result =  new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return result;
    }
    public  int getList() {
         String query = "select count(*) from Products";
          try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
        
    }
    public List<Product> getIndexPage(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Products order by product_id offset ? rows fetch next 8 rows only";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*8);
            rs = ps.executeQuery();
            while (rs.next()) {
               list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> searchProductbyName(String txt,int index) {
           List<Product> list = new ArrayList<>();
           String query = "select count(*) as count from \n" +
"(select ROW_NUMBER() over (order by product_id asc) as r , *\n" +
"from Products where product_name like ?) as x\n" +
"where r between ?*3-2 and ?*3";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" +  txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while(rs.next()) {
            if(rs.getInt("count") != 0) {
            String query1 = "select * from \n" +
"(select ROW_NUMBER() over (order by product_id asc) as r , *\n" +
"from Products where product_name like ?) as x\n" +
"where r between ?*3-2 and ?*3";
            ps = conn.prepareStatement(query1);
            ps.setString(1, "%" + txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs= ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getString("product_des"),
                        rs.getDouble("product_price"),
                        rs.getString("product_img_source"),
                        rs.getString("product_brand"))); 
            }
            return list;
            }
            }
        } catch (Exception e) {
             
        }
        return  null;
    }
     public int count(String txt) {
        Product result = null;
        String query = "select count(*) from Products where product_name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" +txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
              return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
   
    public List<Product> search(String txt, int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from \n" +
"(select ROW_NUMBER() over (order by product_id asc) as r , *\n" +
"from Products where product_name like ?) as x\n" +
"where r between ?*3-2 and ?*3";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" +  txt + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();
            while (rs.next()) {
               list.add(new Product(rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getString("product_des"),
                        rs.getDouble("product_price"),
                        rs.getString("product_img_source"),
                        rs.getString("product_brand")));
            }
            return list;
        } catch (Exception e) {
        }
        return list;
    }
     public static void main(String[] args) {
        DAO dao =new DAO();
        List<Product> list = dao.search("iphone", 1);
         for (Product product : list) {
             System.out.println(product);
         }
    }
    
}