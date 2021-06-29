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
public class PromotionDetailDTO implements Serializable{
    String promotionDetailID;
    UserDTO user;
    String promotionID;
    int rank;
    String userID;

    public PromotionDetailDTO(String promotionDetailID, UserDTO user, String promotionID, int rank) {
        this.promotionDetailID = promotionDetailID;
        this.user = user;
        this.promotionID = promotionID;
        this.rank = rank;
    }

    public PromotionDetailDTO(UserDTO user, int rank) {
        this.user = user;
        this.rank = rank;
    }

    public PromotionDetailDTO(String userID, String promotionID, int rank) {
        this.userID = userID;
        this.promotionID = promotionID;
        this.rank = rank;
        
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    

    public String getPromotionDetailID() {
        return promotionDetailID;
    }

    public UserDTO getUser() {
        return user;
    }

    public String getPromotionID() {
        return promotionID;
    }

    public int getRank() {
        return rank;
    }

    public void setPromotionDetailID(String promotionDetailID) {
        this.promotionDetailID = promotionDetailID;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    
    
    
            
    
}
