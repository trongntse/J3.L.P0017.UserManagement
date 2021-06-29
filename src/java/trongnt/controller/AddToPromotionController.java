/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import trongnt.dto.CartDTO;
import trongnt.dto.PromotionDetailDTO;
import trongnt.dto.UserDTO;

/**
 *
 * @author user
 */
public class AddToPromotionController extends HttpServlet {

    private static final String LOGIN = "adminPage.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url=LOGIN;
        try {
            HttpSession session = request.getSession();
            String userID = request.getParameter("txtUserID");
            String userName = request.getParameter("txtUserName");      
            UserDTO user= new UserDTO(userID, userName);
            PromotionDetailDTO detailDto = new PromotionDetailDTO(user, 5);
            CartDTO cart = (CartDTO) session.getAttribute("CART");
            if (cart == null) {
                cart = new CartDTO("", null);
            }
            cart.add(detailDto);
            session.setAttribute("CART", cart);
        } catch (NumberFormatException e) {
            Logger.getLogger(AddToPromotionController.class).error("error at AddToPromotionController");
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
