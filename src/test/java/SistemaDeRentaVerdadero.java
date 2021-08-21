import java.util.ArrayList;

public class SistemaDeRentaVerdadero {
    private ArrayList<SistemaDeRenta> rentas;
    private ArrayList<Cliente> clientes;
    private SistemaDeRenta renta;

    public SistemaDeRentaVerdadero() {
        rentas=new ArrayList<SistemaDeRenta>(30);
        clientes=new ArrayList<Cliente>(30);

    }

    public void añadirRenta(Cliente cliente, Inventario inventario){
        clientes.add(cliente);
        rentas.add(renta);
        renta.recibo(inventario, cliente); }

    public void devolverRenta(int id){


        for(int i=0;i<rentas.size();i++){
            renta=rentas.get(i);
            if(id==(renta.getId()))
                rentas.remove(renta);
        }}

    public void buscarRenta(int id, Cliente cliente,Inventario inventario){


        for(int i=0;i<rentas.size();i++){
            renta=rentas.get(i);
            renta=rentas.get(i);
            if(id==renta.getId())
                renta.recibo(inventario, cliente);
        }
    }

}
