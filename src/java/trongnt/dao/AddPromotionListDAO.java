/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import trongnt.dto.CartDTO;
import trongnt.dto.PromotionDetailDTO;
import trongnt.utils.DBUtils;

/**
 *
 * @author user
 */
public class AddPromotionListDAO {
    public static boolean addPromotion(String promotionID, String userID, CartDTO cart) throws SQLException, NamingException {
        boolean result = false;
        Connection cn = null;        
        PreparedStatement stm = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                cn.setAutoCommit(false);
                String sqlAdd = "INSERT INTO tblPromotion(PromotionID, userID)\n"
                        + "VALUES ( '" + promotionID + "' , '" + userID + "')";
                stm = cn.prepareStatement(sqlAdd);
                int check = stm.executeUpdate();
                if (check > 0) {
                    for (PromotionDetailDTO detail : cart.getCart().values()) {
                        String sql = "INSERT INTO tblPromotionDetail(promotionID, rank, userID)"
                                + " VALUES ('" + promotionID + "','"+detail.getRank()+"','" + detail.getUser().getUserID() + "')";
                        stm = cn.prepareStatement(sql);
                        int checkDetai = stm.executeUpdate();
                        if (checkDetai < 0) {
                            cn.rollback();
                            stm.close();
                            cn.close();
                            return result;
                        }                       
                    }
                    result = true;
                    cn.commit();
                    cn.setAutoCommit(true);
                }
            }
        } catch (SQLException e) {
            cn.rollback();
            Logger.getLogger(AddPromotionListDAO.class).error("error at AddPromotionListDAO");
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return result;
    }
    
}
