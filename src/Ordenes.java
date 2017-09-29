/**
 * Clase que crea una orden para el usuario
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 */

public class Ordenes {
    
    private int orden;
    private String comida;
    private String bebida;
    private String chips;
    private String hora;
    private int total;
    private int restaurante;
    private boolean despachado=false;
    
    /**
     * Constructor que genera el objecto Orden
     * @param orden: El numero de orden
     * @param comida: El nombre de la comida
     * @param bebida: La bebida
     * @param chips: El nombre de los chips
     * @param total: El total a pagar
     * @param restaurante: El restaurante seleccionado
     * @param hora: La hora de entega
     */
    public Ordenes(int orden, String comida, String bebida, String chips, int total, int restaurante, String hora){
        
        this.orden = orden;
        this.comida = comida;
        this.bebida = bebida;
        this.chips = chips;
        this.total = total;
        this.restaurante = restaurante;
        this.hora = hora;
    }

    /**
     * Consigue el numero de la orden
     * @return: el numero de orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Establece el numero de orden para el usuario
     * @param orden: el numero de orden que se quiere establecer 
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * Consigue el nombre de la comida de la respectiva orden
     * @return: El nombre de la comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * Establece a comida que el usuario adiquirio
     * @param comida: El nombre de la comida
     */
    public void setComida(String comida) {
        this.comida = comida;
    }

    /**
     * Consigue la bebida que el usuario compro
     * @return: El nombre de la bebdia
     */
    public String getBebida() {
        return bebida;
    }

    /**
     * Establece la bebida que el usuario compro
     * @param bebida: El nombre de la bebida
     */
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    /**
     * Consigue el nombre de los chips que el ususario compro
     * @return: El nombre de los chips
     */
    public String getChips() {
        return chips;
    }

    /**
     * Establece el nombre de los chips
     * @param chips: EL nombre de los chips
     */
    public void setChips(String chips) {
        this.chips = chips;
    }

    /**
     * Consigue el total a pagar de la orden
     * @return: El total de la orden
     */
    public int getTotal() {
        return total;
    }

    /**
     * Establece el total de la orden
     * @param total: El total de la orden
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    /**
     * Consigue el numero de restaurante que el usuario escogio
     * @return: El numero del restaurante
     */
    public int getRestaurante() {
        return restaurante;
    }

    /**
     * Establece el numero de restaurante a escoger
     * @param restaurante: El numero del restaurante
     */
    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

    /**
     * Consigue la hora de entrega de la orden
     * @return: La hora de entrega
     */
    public String getHora() {
        return hora;
    }
    
    /**
     * Establece la orden como despachada o no
     * @param despachado: valor booleano
     */
    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }

    /**
     * Consigue si la orden esta despachada o no
     * @return: Si la orden esta despachada o no
     */
    public boolean getDespachado(){
        return despachado;
    }
    
    /**
     * Establece la hora de entrega
     * @param hora: La  hora de entrega
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    /**
     * Concluye si la orden esta despachada o no
     * @param despachado: Valor booleano si la entrega esta despachada o no
     * @return: Un string indicando si la orden esta despachadada
     */
    public String isDespachado(boolean despachado){ 
        String despachadoA = "";
        if (despachado ){ 
            despachadoA = "Si";
        }else{
            despachadoA = "No";
        }
        
        return despachadoA; 
    }
    
}
