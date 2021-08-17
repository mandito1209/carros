
public class Carro {
    private int año;
    private String modelo;
    private String tipo;
    private String color;
    private String matricula;
    private String numSerie;
    private int numPasajeros;
    private int millasRecorridas;
    private float costoRenta;
    private boolean disp;

    public Carro(int año,String modelo, String tipo, String color, String matricula, String numSerie, int numPasajeros, int millasRecorridas, float costoRenta, boolean disp) {
        this.año = año;
        this.modelo=modelo;
        this.tipo=tipo;
        this.color=color;
        this.matricula=matricula;
        this.numSerie=numSerie;
        this.numPasajeros=numPasajeros;
        this.millasRecorridas=millasRecorridas;
        this.costoRenta=costoRenta;
        this.disp=disp;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(int millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    public float getCostoRenta() {
        return costoRenta;
    }

    public void setCostoRenta(float costoRenta) {
        this.costoRenta = costoRenta;
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }
}

