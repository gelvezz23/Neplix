/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import services.Conexion;

/**
 *
 * @author gelvezz23
 */
public class MysqlUsuarioDAO extends Conexion{
    
    public boolean registrar(Usuario usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuario(username,password,correo,rol) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsername());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getEmail());
            ps.setString(4, usr.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
     public boolean login(Usuario usr) {
        PreparedStatement ps = null;
         ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT username,password,correo,id,rol FROM usuario WHERE username = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsername());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(2))) {
                    usr.setEmail(rs.getString(3));
                    usr.setRol(rs.getString(5));
                    usr.setUsername(rs.getString(1));
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
}
