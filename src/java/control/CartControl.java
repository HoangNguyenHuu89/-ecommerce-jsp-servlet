/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Cart;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hoang
 */
@WebServlet(name = "CartControl", urlPatterns = {"/cart"})
public class CartControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        String txt = request.getParameter("id");
        if(txt !=null && !txt.equals("")) {
            int pID = Integer.parseInt(txt);
            List<Cart> cart = null;
            if(session.getAttribute("Cart") != null) {
                cart = (List<Cart>) session.getAttribute("Cart");
            }else {
                cart = new ArrayList<>();
            }
            Cart item = null;
            for (Cart c : cart) {
                if(c.getItems().getProduct_id() == pID) {
                    item = c;
                    break;
                }
             }
            DAO dao = new DAO();
            Product p = dao.getProduct(pID);
            if(item == null) {
                item = new Cart(p, 1);
                cart.add(item);
            }
            else {
                item.setQuantity(item.getQuantity() +1);
                
            }
//          if(cart !=null) {
//              double total = 0;
//              for (Cart c : cart) {
//                  total += c.getQuantity()*c.getItems().getProduct_price();
//              }
//              session.setAttribute("total", total);
//              request.setAttribute("vat", 0.1 * total);
//              session.setAttribute("sum", 1.1 * total);
//          }
          session.setAttribute("Cart", cart);
          request.getRequestDispatcher("show").forward(request, response);
           
    }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
