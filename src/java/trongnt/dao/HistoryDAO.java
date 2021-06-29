/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import trongnt.dto.PromotionDetailDTO;
import trongnt.utils.DBUtils;

/**
 *
 * @author user
 */
public class HistoryDAO {

    public static List<PromotionDetailDTO> getDetailHistory(String userAd) throws SQLException, NamingException {
        List<PromotionDetailDTO> list = null;
        Connection cn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "SELECT p.promotionID, d.userID ,d.rank \n"
                        + "From tblPromotion P, tblPromotionDetail D\n"
                        + "where p.promotionID=d.promotionID and p.userID='" + userAd + "'";
                stm = cn.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    String userID = rs.getString("userID");
                    String promotionID = rs.getString("promotionID");
                    int rank = rs.getInt("rank");
                    PromotionDetailDTO detail = new PromotionDetailDTO(userID, promotionID, rank);
                    list.add(detail);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(HistoryDAO.class).error("Error at HistoryDAO");
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return list;
    }

}
