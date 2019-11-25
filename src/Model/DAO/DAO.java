/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Usuario;
import java.awt.List;

/**
 *
 * @author carlos
 */
public interface DAO<clase, Tdato> {
    
    void insertar(clase user);
    
    void deshabilitar(clase user);
    
    void modificar(clase user);
    
    void consultarTodos();
    
    Usuario buscar(Tdato id);
    
}
