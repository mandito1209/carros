
/*
 * En este codigo se encuentra la clase Renta de Auto que es especificamente 
 * para detallar la informacion de la renta del cliente
 */

/**
 *
 * @author Lenovo
 */
public class RentaAuto {
    
    private int dias; //Los dias a rentar
    private Carro tipoAuto; //Tipo de auto
    private Cliente cliente;
    private boolean seRento = false; //Verificar si la renta si fue aceptada
    private int idRenta; //id que puede ser usado para buscar la renta
    private float costoRenta; 
    
    public RentaAuto(int dias,Carro tipoAuto, int idRenta, float costoRenta,Cliente cliente){
        this.dias = dias;
        this.cliente = cliente;
        this.tipoAuto = tipoAuto;
        this.idRenta = idRenta;
        this.costoRenta = costoRenta;
    }
    
    public int getId(){
        return idRenta;
    }
    public void setId(int idRenta){
        this.idRenta = idRenta;
    }
    public float getCosto(){
        return costoRenta;
    }
    public void setId(float costoRenta){
        this.costoRenta = costoRenta;
    }
    public int getDias(){
        return dias;
    }
    public void setDias(int dias){
        this.dias = dias;
    }
    
    public boolean siRentado(){
        this.seRento = !seRento;
        return seRento;
    }
    public String imprimirRecibo(){
        return "testing mas tarde le agrego cuando tengamos las demas clases";
    }
    
    
}
