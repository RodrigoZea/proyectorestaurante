/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 */
public class users {

//Variables de instancia    
private String usuario, clave;
    
    public users(){
        //Constructor normal
        this.usuario = "";
        this.clave = "";
    }
    
    public users(String usuario, String clave){ 
        //Cuando se envía el parametro crearlo con lo que el usuario haya dicho
        this.usuario = usuario;
        this.clave = clave;
    }
    
    //Getters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
