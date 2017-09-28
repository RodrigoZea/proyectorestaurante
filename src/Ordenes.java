/**
 *
 * @author Usuario
 */

public class Ordenes {
    
    private int orden;
    private String comida;
    private String bebida;
    private String chips;
    private String hora;
    private int total;
    private int restaurante;
    
    public Ordenes(int orden, String comida, String bebida, String chips, int total, int restaurante, String hora){
        
        this.orden = orden;
        this.comida = comida;
        this.bebida = bebida;
        this.chips = chips;
        this.total = total;
        this.restaurante = restaurante;
        this.hora = hora;
        
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    public String getDetalles(){ 
        String cadena="";
        cadena = "Numero de orden: " + getOrden() + "\n" + 
                getComida() + " " + getBebida() + " " + getChips() + "\n";
        
        return cadena;
    }

    
}
