/**
 * Clase que crea usuarios para las personas que utilizaran el servicio
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
    
    /**
     * Crea un objeto user a partir de los parametros que le envia el usuario
     * @param usuario
     * @param clave
     */
    public users(String usuario, String clave){ 
        //Cuando se envía el parametro crearlo con lo que el usuario haya dicho
        this.usuario = usuario;
        this.clave = clave;
    }
    
    //Getters

    /**
     * Consigue el nombre de usuario de la persona
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Permite configurar el nombre de usuario
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Consigue la contrasena de usuario de la persona
     * @return clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Permite configurar la contrasena del usuario
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
