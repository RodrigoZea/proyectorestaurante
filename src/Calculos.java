
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Se encarga en realizar los calculos que se deben utilizar
 * @author Oscar Juarez, Rodrigo Zea, Andres Quan
 * @version: 14/09/17
 */
public class Calculos {
    
    private String user, pass;
    public static ArrayList<users> usuariosCalc = new ArrayList<>();
    
    public Calculos(){
         
        String user = "", pass = "";    
    }

    /**
     * Se encarga de observar si ya existe el usuario en la lista o no.
     * @param usuario
     * @param contra
     */
    public boolean Validar(String usuario, String contra) {
        
        boolean cuentaE = false;
        boolean confirmar;
        Login entrar = new Login();
        
        // Busca si existe el usuario o no
        for (int i = 0; i < usuariosCalc.size(); i++) {
            if (usuariosCalc.get(i).getUsuario().equals(usuario) && usuariosCalc.get(i).getClave().equals(contra)) {
                //Si la cuenta existe y el usuario ingreso su clave respectiva
                //Entonces se marca el boolean que la cuenta sí existe
                cuentaE = true;
                
            }
        }
        
        //Si la cuenta existe entonces...
        if (cuentaE == true ){ 
            //Se muestra un aviso de verificación completa
            JOptionPane.showMessageDialog(entrar, "Verificación completa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            confirmar = true;
            
        }else{
            //Si no existe entonces que muestre un error
            JOptionPane.showMessageDialog(entrar, "Usuario o contraseña incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
            confirmar = false;
            
        }
        
        return confirmar; 
        
    }
    
    public boolean validarAdmin(String usuario, String contra){
        
        boolean confirmar = false;
        Login entrar = new Login();
        
        if (usuario.equals("admin") && contra.equals("admin")) {
            
            confirmar = true;
            JOptionPane.showMessageDialog(entrar, "Bienvenido administrador!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        
        } else {
            
            confirmar = false;
            JOptionPane.showMessageDialog(entrar, "Usted no es un administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        return confirmar;
    }
    
    /**
     * Agrega un usuario al ArrayList de users/usuarios.
     * @param usuario
     * @param contra
     */
    public void agregarUsuario(String usuario, String contra){
        boolean exists = false;
        
        
        try{ 
        //Si no hay ningún usuario registrado que haga esto...    
        if (usuariosCalc.isEmpty()){
             //Agrega un nuevo usuario a la lista
             users usr1 = new users(usuario, contra);
             usuariosCalc.add(usr1);
             //Se muestra el mensaje de éxito            
             JOptionPane.showMessageDialog(null, "Éxito", "Usuario Agregado", JOptionPane.INFORMATION_MESSAGE); 
 
        }else{ 
            //Busca si existe el usuario o no
            for (int i = 0; i < usuariosCalc.size(); i++) {
                if (usuariosCalc.get(i).getUsuario().equals(usuario)) {
                  exists = true;
                }
            }
            //Si existe entonces que no se pueda registrar porque ya existe
            if (exists){
                JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Error", JOptionPane.INFORMATION_MESSAGE); 
            //Si no existe que se agregue a la lista de usuarios
            }else{
                users usr1 = new users(usuario, contra);
                usuariosCalc.add(usr1);
                //Mensaje de éxito
                JOptionPane.showMessageDialog(null, "Usuario Agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE); 
            }
            
        }
        }catch (Exception e){
            e.getMessage();
        }
        
    }
    
    /**
     * Muestra los detalles de las opciones de un restaurante a partir de la opcion que el usuario elija
     * @param x
     */
    public void showDetails(int x){
        
        String nombre = "", descripcion = "", horario = "";
        int horaAb = 0, horaCe = 0;
        Restaurantes rest = new Restaurantes();
   
        int opt = x;
        //Switch dependiendo de qué opción elige
        switch(opt){
            case 1:  
              //Dependiendo del restaurante que se ponga ese nombre, descripción, horario, hora de apertura y hora de cierre  
              nombre = "Go Green";  
              descripcion = "Provee una variedad de alimentos más saludables que los de otros restaurantes";
              horario = "10:00 AM - 15:30 PM";
              horaAb = 1000;
              horaCe = 1530;
              break;
            case 2:
              //Dependiendo del restaurante que se ponga ese nombre, descripción, horario, hora de apertura y hora de cierre 
              nombre = "Bagel Bros";    
              descripcion = "Ofrece sandwiches de tipo Bagel, los cuales pueden ser una alternativa a sandwiches normales";
              horario = "08:30 AM - 14:00 PM";
              horaAb = 830;
              horaCe = 1400;
              break;
            case 3:
              //Dependiendo del restaurante que se ponga ese nombre, descripción, horario, hora de apertura y hora de cierre 
              nombre = "Café Gitane";    
              descripcion = "Ofrece meriendas simples para un receso o una variedad de almuerzos";
              horario = "06:30 AM - 17:00 PM";
              horaAb = 630;
              horaCe = 1700;
              break;
            case 4:
              //Dependiendo del restaurante que se ponga ese nombre, descripción, horario, hora de apertura y hora de cierre 
              nombre = "Picnic";   
              descripcion = "Ofrece opciones de comida más caseras y tradicionales que otros restaurantes";  
              horario = "07:00 AM - 15:00 PM";
              horaAb = 700;
              horaCe = 1500;
              break;
        }
        
        
        //Se muestra un botón de confirmación
        if (JOptionPane.showConfirmDialog(rest, (descripcion + "\n" + "Horario: " + horario), (nombre),
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            //Si el usuario sí decide elegir ese restaurante que se haga esto
            Menu menu = new Menu(opt, horaAb, horaCe);
            menu.setVisible(true);
            rest.setVisible(false);
        } else {
            //Si dice que no, que no haga nada, solo se cierre el aviso
        }
        
        
    }
    
    /**
     * Depende del restaurante que eligio, las opciones del ComboBox cambiaran dinamicamente
     * @param x
     * @param comidaCbx
     * @param bebidaCbx
     * @param chipsCbx
     */
    public void showOpts(int x, JComboBox comidaCbx, JComboBox bebidaCbx, JComboBox chipsCbx){
        
        switch (x){
            case 1:
                //Si eligió GoGreen...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "iGO Indic", "iGO Cesar", "iGO Club", "Ensalada" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pepsi Light", "Limonada Piña", "Agua Pura", "Limonada Fresa" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Lays", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 2:
                //Bagel Bros...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pollo Cesar", "Pavocado", "Napoli", "Grilled Cheese" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pepsi", "Mirinda", "Agua Pura", "7 Up" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Lays", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 3:
                //Café Gitane...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Gitane Pollo", "Quesadilla", "Croissant", "Hamburgesa" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Horchata", "Naranjada", "Jamaica", "Limonada" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Brownie", "Lays Verdes", "Dorito Rojo", "Dorito Verde" }));
                break;
            case 4:
                //Picnic...
                comidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Pan con Huevo", "Pan con Jamón", "Pan con Frijol", "Sopa" }));
                bebidaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Aloe Vera", "Mountain Dew", "Pepsi", "Mirinda" }));
                chipsCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin opción" , "Papas", "Dorito Verde", "Dorito Rojo", "Lays Verdes" }));
                break;
        } 
        
    }
    
    /**
     * Se configuran los precios de los platos principales
     * @param comidaCbx
     * @return precioC
     */
    public int setPreciosC(JComboBox comidaCbx){ 
        //Se ponen los precios de cada "plato principal"
        
        int precioC = 0;
        
        if (comidaCbx.getSelectedItem().equals("iGO Indic")){
            precioC = 25;
        }else if (comidaCbx.getSelectedItem().equals("iGO Cesar")){
            precioC = 25;
        }else if (comidaCbx.getSelectedItem().equals("iGO Club")){
            precioC = 25;
        }else if (comidaCbx.getSelectedItem().equals("Ensalada")){
            precioC = 35;
        }else if (comidaCbx.getSelectedItem().equals("Pollo Cesar")){
            precioC = 36;
        }else if (comidaCbx.getSelectedItem().equals("Pavocado")){
            precioC = 35;
        }else if (comidaCbx.getSelectedItem().equals("Napoli")){
            precioC = 40;
        }else if (comidaCbx.getSelectedItem().equals("Grilled Cheese")){
            precioC = 20;
        }else if (comidaCbx.getSelectedItem().equals("Gitane Pollo")){
            precioC = 38;
        }else if (comidaCbx.getSelectedItem().equals("Quesadilla")){
            precioC = 32;
        }else if (comidaCbx.getSelectedItem().equals("Croissant")){
            precioC = 20;
        }else if (comidaCbx.getSelectedItem().equals("Hamburgesa")){
            precioC = 28;
        }else if (comidaCbx.getSelectedItem().equals("Pan con Huevo")){
            precioC = 15;
        }else if (comidaCbx.getSelectedItem().equals("Pan con Jamon")){
            precioC = 13;
        }else if (comidaCbx.getSelectedItem().equals("Pan con Frijol")){
            precioC = 23;
        }else if (comidaCbx.getSelectedItem().equals("Sopa")){
            precioC = 25;
        }else if (comidaCbx.getSelectedItem().equals("Sin opción")){
            precioC = 0;
        }
        
        return precioC;
        
        
    }
    
    /**
     * Se configuran los precios de las bebidas de un restaurante
     * @param bebidaCbx
     * @return precioB
     */
    public int setPreciosB(JComboBox bebidaCbx){
       //Se ponen los precios de cada tipo de bebida
       
       int precioB = 0;
       
       if (bebidaCbx.getSelectedItem().equals("Sin opción")){
            precioB = 0;
        }else if (bebidaCbx.getSelectedItem().equals("Pepsi Light")){
            precioB = 8;
        }else if (bebidaCbx.getSelectedItem().equals("Limonada Piña")){
            precioB = 5;
        }else if (bebidaCbx.getSelectedItem().equals("Agua Pura")){
            precioB = 5;
        }else if (bebidaCbx.getSelectedItem().equals("Limonada Fresa")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Pepsi")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Mirinda")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("7 Up")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Aloe Vera")){
            precioB = 12;
        }else if (bebidaCbx.getSelectedItem().equals("Mountain Dew")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Horchata")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Jamaica")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Naranjada")){
            precioB = 7;
        }else if (bebidaCbx.getSelectedItem().equals("Limonada")){
            precioB = 7;
        }
    
    return precioB;
    }
    
    /**
     * Se configuran los precios de los acompanamientos o chips que ofrece un restaurante
     * @param chipsCbx
     * @return precioCh
     */
    public int setPreciosCh(JComboBox chipsCbx){ 
        //Se ponen los precios de cada opción de chips o snack extra
        
       int precioCh = 0;
        
        if (chipsCbx.getSelectedItem().equals("Sin opción")){
            precioCh = 0;
        }else if (chipsCbx.getSelectedItem().equals("Lays")){
            precioCh = 4;
        }else if (chipsCbx.getSelectedItem().equals("Lays Verdes")){
            precioCh = 4;
        }else if (chipsCbx.getSelectedItem().equals("Dorito Rojo")){
            precioCh = 5;
        }else if (chipsCbx.getSelectedItem().equals("Dorito Verde")){
            precioCh = 5;
        }else if (chipsCbx.getSelectedItem().equals("Brownie")){
            precioCh = 7;
        }else if (chipsCbx.getSelectedItem().equals("Papas")){
            precioCh = 10;
        }
        
        return precioCh;
        
    }
    
    /**
     * Suma el total de la orden, a partir del precio del plato principal, bebida y chips
     * @param ordLbl3
     * @param precioC
     * @param precioB
     * @param precioCh
     * @return pTotal
     */
    public int sumar(JLabel ordLbl3, int precioC, int precioB, int precioCh){
        //Suma los precios de comida, bebida y los chips
        
        int pTotal = 0;
        pTotal = precioC + precioB + precioCh;
        
        return pTotal;
    }
    
    //Verifica si la hora coincide con el restaurante elegido

    /**
     * Verifica si el restaurante si se encuentra abierto a la hora que pidio la orden el usuario
     * @param horaAb
     * @param horaCe
     * @param hora
     * @param espacio
     * @return verificar
     */
    public boolean horaCorrecta (int horaAb, int horaCe, String hora, JTextField espacio){ 

        boolean verificar = false;
        
        //Si la hora contiene más de 4 caracteres entonces sí cumple con el formato
        if (hora.length()>4) {
            //Si el número de la hora que ingreso el usuario está entre la hora de apertura y cierre...
            
           //Convierte la hora en un número
           int nHora = Integer.parseInt(hora.substring(0,2) + hora.substring(3,5));
           
           if (nHora >= horaAb && nHora <= horaCe){
              //La hora es correcta y se muestran las opciones de pago
              JOptionPane.showMessageDialog(null, "Hora ingresada correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
              espacio.disable();
              verificar = true;
           }else{
             //Se muestra el error que el restaurante no está abierto a esa hora
            JOptionPane.showMessageDialog(null, "El restaurante no está abierto a esa hora", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
           }
      
             
        } else {
            //Si el formato de la hora está equivocada, se muestra un error
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una hora valida", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return verificar;
    }
    
    public void verProductos(ArrayList<Ordenes> lista, JComboBox comboBox, String restaurante, int decision){
        
        for(Ordenes x:lista){
            
            if (restaurante.equals("Go Green")){
                
                for (int i = 0; i < lista.size(); i++) {
                    
                    if (x.getRestaurante()==1){
                        
                        comboBox.addItem("Orden " + x.getOrden());
                        
                    } else if (x.getRestaurante()==2){
                        
                        comboBox.addItem("Orden " + x.getOrden());
                        
                    }
                    
                }
                
                
            }
            
            
        }
        
    }
    
    
    
}
