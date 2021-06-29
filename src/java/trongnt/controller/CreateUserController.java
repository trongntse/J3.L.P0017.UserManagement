/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import trongnt.dao.UserDAO;
import trongnt.dto.UserDTO;

/**
 *
 * @author user
 */
public class CreateUserController extends HttpServlet {

    private static final String ERROR = "createPage.jsp";
    private static final String SUCCESS = "LoadAllUserController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        String error = "";
        boolean check = true;
        try {
            String userID = request.getParameter("txtUserID");
            String userName = request.getParameter("txtUserName");
            String password = request.getParameter("txtPassword");
            String cfPassword = request.getParameter("txtCfPassword");
            String email = request.getParameter("txtEmail");
            String phone = request.getParameter("txtPhone");
            String photo = request.getParameter("txtPhoto");
            if (UserDAO.checkDuplicateID(userID)) {
                error = "USER " + userID + " is already exist!";
                request.setAttribute("ERROR_USER", error);
                check = false;
                return;
            }
            if (!phone.matches("[0-9]{10,15}")) {
                error = "Phone is number and atleast 10 digits !";
                request.setAttribute("ERROR_PHONE", error);
                check = false;
                return;
            }
            if (!password.equals(cfPassword)) {
                error = "password không giống nhau";
                request.setAttribute("ERROR_PASS", error);
                check = false;
                return;
            }
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte hashBytes[] = messageDigest.digest(cfPassword.getBytes(StandardCharsets.UTF_8));
            BigInteger noHash = new BigInteger(1, hashBytes);
            String passCreate = noHash.toString(16);
            if (check) {
                UserDTO userNew = new UserDTO(userID, userName, passCreate, email, phone, photo, "US", true);
                if (UserDAO.createUser(userNew)) {
                    request.setAttribute("ERROR_CREATE", error);
                    url = SUCCESS;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(CreateUserController.class).error("error at CreateUserController");
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
