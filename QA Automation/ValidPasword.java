/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioContrasena;

/**
 *
 * @author luis
 */
public class Contrasena {
    
    public boolean ValidarContrasena(String clave){
        
           if ("MCICJaguares".equals(clave)){
            return true;
        }
        else{
            return false;
        }
        
    
    }
    
}
