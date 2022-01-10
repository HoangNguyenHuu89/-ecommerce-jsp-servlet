/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang
 */
public class DaoAccount {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Account> getAll() {
        String query = "select * from Account";
        List<Account> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
              list.add(new Account(rs.getString(1),
                      rs.getString(2),
                      rs.getString(3),
                      rs.getString(4),
                      rs.getString(5),
                      rs.getInt(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public  Account  LoginAccount(String user, String pass) {
        String query = "select * from Account where user_mail = ? and password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                 return new Account(rs.getString(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
     public  Account  checkAccount(String user) {
        String query = "select * from Account where user_mail = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                 return new Account(rs.getString(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
     public  Account  SignUp(String user, String pass,String name, String address, int phone) {
        String query = "insert into Account values(?,?,1,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, name);
            ps.setString(4, address);
            ps.setInt(5, phone);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }
    public static void main(String[] args) {
        List<Account> list = new DaoAccount().getAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
