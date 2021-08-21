public class SistemaDeRenta {
    private String fechaD;
    private String fechaR;
    private String ciudadD;
    private String ciudadR;
    private int numRenta;
    private int dias;
    private int id;

    public SistemaDeRenta(String fechaD, String fechaR, String ciudadD, String ciudadR,int dias,int id) {
        this.fechaD = fechaD;
        int ren=(int)(Math. random()9999+1000);
        this.fechaR = fechaR;
        this.ciudadD = ciudadD;
        this.ciudadR = ciudadR;
        numRenta=ren;
        this.dias=dias;
        this.id=id;
    }

    public String recibo(Inventario inventario, Cliente cliente){
        float precio;

        Carro auto=inventario.buscar(id);
        precio=(auto.getCostoRenta())*dias;

        return "Renta de automovil"+"Datos del cliente\n------------------------------\nNombre: "+
                cliente.getNombre()+"\nNumero telefonico: "+cliente.getNumCelular()+"\nCodigo de renta"+numRenta
                + "\nDatos del auto \n------------------------------\nModelo: "+auto.getModelo()+
                "\nTipo: "+auto.getTipo()+"\nColor: "+auto.getColor()+"\nAño: "+auto.getAño()+"\nMatricula: "
                +auto.getMatricula()+"\nNumero de serie: "+auto.getNumSerie()+"\nNumero maximo de pasajeros: "+
                auto.getNumPasajeros()+"\nKilometraje: "+auto.getKilometraje()+"\nFecha de devolucion: "+fechaD+
                "\nFecha de renta: "+fechaR+"\nCiudad de devolucion: "+ciudadD+"\nCiudad de renta: "+ciudadR
                +"\nDias de renta: "+dias+"\n\n\nCosto por dia: "+auto.getCostoRenta()+" x "
                +dias+"\n     Total = "+precio;}

    public int getId() {
        return id;
    }
}