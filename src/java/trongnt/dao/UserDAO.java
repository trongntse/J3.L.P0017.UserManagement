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
import trongnt.dto.UserDTO;
import trongnt.utils.DBUtils;

/**
 *
 * @author user
 */
public class UserDAO {

    public static List<UserDTO> getListUser() {
        List<UserDTO> listUser = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = " SELECT userID, userName, password, email, phone, photo, roleID, status\n"
                        + " FROM tblUser ";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String photo = rs.getString("photo");
                    String roleID = rs.getString("roleID");
                    boolean status = rs.getBoolean("status");
                    listUser.add(new UserDTO(userID, userName, password, email, phone, photo, roleID, status));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
            }
        }
        return listUser;
    }

    public static List<UserDTO> getListSub() {
        List<UserDTO> listUser = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = " SELECT userID, userName, password, email, phone, photo, roleID, status\n"
                        + " FROM tblUser\n"
                        + " WHERE roleID = 'US'";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String photo = rs.getString("photo");
                    String roleID = rs.getString("roleID");
                    boolean status = rs.getBoolean("status");
                    listUser.add(new UserDTO(userID, userName, password, email, phone, photo, roleID, status));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
            }
        }
        return listUser;
    }

    public static List<UserDTO> getListAdmin() {
        List<UserDTO> listUser = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = " SELECT userID, userName, password, email, phone, photo, roleID, status\n"
                        + " FROM tblUser\n"
                        + " WHERE roleID = 'AD'";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String photo = rs.getString("photo");
                    String roleID = rs.getString("roleID");
                    boolean status = rs.getBoolean("status");
                    listUser.add(new UserDTO(userID, userName, password, email, phone, photo, roleID, status));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
            }
        }
        return listUser;
    }

    public static UserDTO loadUser(String userID) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " SELECT userID, userName, password, email, phone, photo, roleID, status\n"
                        + " FROM tblUser\n"
                        + " WHERE userID=? And roleID = 'US'";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    user = new UserDTO(rs.getString("userID"),
                            rs.getString("userName"),
                            rs.getString("password"),
                            rs.getString("email"),
                            rs.getString("phone"),
                            rs.getString("photo"),
                            rs.getString("roleID"),
                            rs.getBoolean("status"));
                }
            }
        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }

    public static UserDTO checkLogin(String userID, String password) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT UserID, UserName, RoleID"
                        + "   FROM tblUser"
                        + "   WHERE UserID = ? AND Password = ? AND Status = 'True'";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    userID = rs.getString("UserID");
                    String userName = rs.getString("userName");
                    String role = rs.getString("RoleID");
                    user = new UserDTO(userID, userName, role, true);
                }
            }
        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }

    public static boolean checkDuplicateID(String userID) throws SQLException {
        Connection cn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {

                String sql = "SELECT userName\n"
                        + " FROM tblUser\n "
                        + "WHERE userID=? ";
                stm = cn.prepareStatement(sql);
                stm.setString(1, userID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    result = true;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
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
        return result;
    }

    public static boolean createUser(UserDTO user) throws SQLException {
        boolean result = false;
        Connection cn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "INSERT INTO tblUser(userID, userName, password, email, phone, photo, roleID, status)\n"
                        + "   VALUES(?,?,?,?,?,?,?,?)";
                stm = cn.prepareStatement(sql);
                stm.setString(1, user.getUserID());
                stm.setString(2, user.getUserName());
                stm.setString(3, user.getPassword());
                stm.setString(4, user.getEmail());
                stm.setString(5, user.getPhone());
                stm.setString(6, user.getPhoto());
                stm.setString(7, user.getRoleID());
                stm.setBoolean(8, user.isStatus());
                result = stm.executeUpdate() > 0;
            }
        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
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
        return result;
    }

    public static int deleteUser(String userID, boolean status) {
        int result = 0;
        Connection cn = null;
        PreparedStatement pst = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser\n"
                        + " SET status= ? \n"
                        + " WHERE userID=?";
                pst = cn.prepareStatement(sql);
                pst.setString(2, userID);
                pst.setBoolean(1, status);
                result = pst.executeUpdate();
            }

        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }
        return result;
    }

    public static int updateUser(UserDTO user) {
        int result = 0;
        Connection cn = null;
        PreparedStatement pst = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser "
                        + " SET userName=?, password=?, email=?, phone=?, photo=?, roleID=?, status=?\n"
                        + " WHERE userID=?";
                pst = cn.prepareStatement(sql);
                pst.setString(1, user.getUserName());
                pst.setString(2, user.getPassword());
                pst.setString(3, user.getEmail());
                pst.setString(4, user.getPhone());
                pst.setString(5, user.getPhoto());
                pst.setString(6, user.getRoleID());
                pst.setBoolean(7, user.isStatus());
                pst.setString(8, user.getUserID());
                result = pst.executeUpdate();
            }

        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }
        return result;
    }

    public static List<UserDTO> searchNameUser(String search) {
        List<UserDTO> listUser = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = " SELECT userID, userName, password, email, phone, photo, roleID, status\n"
                        + " FROM tblUser\n"
                        + " WHERE roleID='US' and userName like ?";
                pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + search + "%");
                rs = pst.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String photo = rs.getString("photo");
                    String roleID = rs.getString("roleID");
                    boolean status = rs.getBoolean("status");
                    listUser.add(new UserDTO(userID, userName, password, email, phone, photo, roleID, status));
                }
            }
        } catch (SQLException | NamingException e) {
            Logger.getLogger(UserDAO.class).error("error at UserDAO");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }
        return listUser;
    }

}
