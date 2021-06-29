/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import trongnt.dao.AddPromotionListDAO;
import trongnt.dto.CartDTO;
import trongnt.dto.UserDTO;

/**
 *
 * @author user
 */
public class SaveListController extends HttpServlet {

    private static final String ERROR = "promotionList.jsp";
    private static final String SUCCESS = "promotionList.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
            CartDTO cart = (CartDTO) session.getAttribute("CART");                    
            cart.setUser(user.getUserID());
            Date date = new Date();
            SimpleDateFormat requestIDFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            String promotionId = requestIDFormat.format(date);
            if (AddPromotionListDAO.addPromotion(promotionId, user.getUserID(), cart)) {
                url = SUCCESS;
            } else {
                url = ERROR;
            }
        } catch (NumberFormatException e) {
            Logger.getLogger(SaveListController.class).error("error at SaveListController");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SaveListController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            java.util.logging.Logger.getLogger(SaveListController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SaveListController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            java.util.logging.Logger.getLogger(SaveListController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
