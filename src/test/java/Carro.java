
public class Carro {
    private String modelo;
    private String tipo;
    private String color;
    private String matricula;
    private int numSerie;
    private int año;
    private int numPasajeros;
    private int kilometraje;
    private float costoRenta;
    private boolean disponibilidad;
    private int id;

    public Carro(String modelo, String tipo, String color, String matricula, int numSerie, int año, int numPasajeros, int kilometraje, float costoRenta,int id) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.matricula = matricula;
        this.numSerie = numSerie;
        this.año = año;
        this.numPasajeros = numPasajeros;
        this.kilometraje = kilometraje;
        this.costoRenta = costoRenta;
        disponibilidad = true;
        this.id=id;
    }
    public String informacion(){
        return "Modelo: "+modelo+"\nTipo: "+tipo+"\nColor: "+color+"\nMatricula: "+
                "\nNo. de serie: "+numSerie+"\nAño: "+año+"\nNo. de pasajeros: "+numPasajeros+
                "\nKilometraje: "+kilometraje+"\nCosto de renta por dia: "
                +costoRenta+" pesos\nDisponibilidad: "+disponibilidad;}

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public int getAño() {
        return año;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public float getCostoRenta() {
        return costoRenta;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nAuto{" + "modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", matricula=" + matricula + ", numSerie=" + numSerie + ", a\u00f1o=" + año + ", numPasajeros=" + numPasajeros + ", kilometraje=" + kilometraje + ", costoRenta=" + costoRenta + ", disponibilidad=" + disponibilidad + ", id=" + id + '}';
    }

}

