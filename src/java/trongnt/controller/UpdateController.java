/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import trongnt.dao.UserDAO;
import trongnt.dto.UserDTO;

/**
 *
 * @author user
 */
public class UpdateController extends HttpServlet {

    public static final String ERROR = "adminPage.jsp";
    public static final String SUCCESS = "adminPage.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url=ERROR;
        HttpSession session=request.getSession();
        try {            
            String userID=request.getParameter("txtUserID");
            String userName=request.getParameter("txtUserName");
            String password=request.getParameter("txtPassword");           
            String email=request.getParameter("txtEmail");
            String phone=request.getParameter("txtPhone");
            String photo=request.getParameter("txtPhoto");
            if (photo == "") {
                photo = request.getParameter("oldPhoto");
            }
            UserDTO user=new UserDTO(userID, userName, password, email, phone, photo, "US", true);
            if(UserDAO.updateUser(user)>0){               
                List<UserDTO> list=UserDAO.getListUser();
                session.setAttribute("LIST_USER", list);
                url=SUCCESS;
            }        
        } catch (Exception e) {
             Logger.getLogger(UpdateController.class).error("error at UpdateController");
        }finally{
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
