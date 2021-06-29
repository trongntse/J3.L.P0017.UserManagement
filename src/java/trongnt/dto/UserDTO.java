/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.dto;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class UserDTO implements Serializable{
    String userID;
    String userName;
    String password;
    String email;
    String phone;
    String photo;
    String roleID;
    boolean status;

    public UserDTO(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    
    public UserDTO(String userID, String userName, String password, String email, String phone, String photo, String roleID, boolean status) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.photo = photo;
        this.roleID = roleID;
        this.status = status;
    }

    public UserDTO(String userID, String userName, String roleID, boolean status) {
        this.userID = userID;
        this.userName = userName;
        this.roleID = roleID;
        this.status = status;
    }
    
    

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhoto() {
        return photo;
    }

    public String getRoleID() {
        return roleID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
