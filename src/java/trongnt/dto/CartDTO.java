/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.dto;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class CartDTO {
    private String User;
    private Map<String, PromotionDetailDTO> cart;

    public CartDTO(String User, Map<String, PromotionDetailDTO> cart) {
        this.User = User;
        this.cart = cart;   
    }

    public String getUser() {
        return User;
    }

    public Map<String, PromotionDetailDTO> getCart() {
        return cart;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setCart(Map<String, PromotionDetailDTO> cart) {
        this.cart = cart;
    }
    
    public void add(PromotionDetailDTO dto) {
        if (cart == null) {
            this.cart = new HashMap<String, PromotionDetailDTO>();
        }
        cart.put(dto.getUser().getUserID(), dto);
    }

    public void delete(String userID) {
        if (this.cart == null) {
            return;
        }
        if (this.cart.containsKey(userID)) {
            this.cart.remove(userID);
        }
    }

    public void update(PromotionDetailDTO dto) {
        if (this.cart != null) {
            if (this.cart.containsKey(dto.getUser().getUserID())) {
                this.cart.replace(dto.getUser().getUserID(), dto);
            }
        }
    }
    
}
