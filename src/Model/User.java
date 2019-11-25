/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import services.Conexion;

/**
 *
 * @author carlos
 */
public class User {
     Conexion con;
     Usuario user;
     
    public User() {
        con = new Conexion();
    }
    
    public ArrayList<Usuario> logueo(String usuario,String password, String rol){
            Connection con = null;
            PreparedStatement pst;
            ResultSet rs;
            ArrayList array = new ArrayList();
            
            try {
                 pst= (PreparedStatement) con.createStatement();
                 rs= pst.executeQuery("SELECT * FROM usuario");
                 while(rs.next()){
                     user = new Usuario();
                     user.setUsername(rs.getString("usurname"));
                     user.setPassword(rs.getString("password"));
                     user.setEmail(rs.getString("email"));
                     
                     array.add(user);
                     
                 
                 }
                 
                 
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error "+e);
        } finally{
                try {
                    con.close();
                } catch (Exception e) {
                }
            
            }
    return array;
    }
    
    public void IngresoUsuario(){
    
    
    if(user.getUsername() != null && user.getPassword() != null && user.getRol().equalsIgnoreCase("user")){
       
     }  
    }
    
}
