/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Cliente {
    private String nombre;
    private int edad;

    private long numCelular;
    private boolean rentando;

    public Cliente(String nombre, int edad, long numCelular) {
        this.nombre = nombre;
        this.edad = edad;

        this.numCelular = numCelular;
        rentando=false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumCelular() {
        return numCelular;
    }

    public boolean isRentando() {
        return rentando;
    }

    public void setRentando(boolean rentando) {
        this.rentando = rentando;
    }
}
