/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Vista.login;
import Control.Login;
import Model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author carlos
 */
public class Login implements ActionListener{
    
    private login vista;
    private Usuario modelo;

    public void event(){
    vista.btnIniciarSesion.addActionListener(this);
    vista.jButton2.addActionListener(this);
        
    }
    
    public Login(login vista) {
        this.vista=vista;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(vista.btnIniciarSesion)){
                
        }    }
    
    
}
