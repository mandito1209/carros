import java.util.ArrayList;

public class SistemaDeRenta {
    private ArrayList<Renta> rentas;
    private ArrayList<Cliente> clientes;
    //private Renta renta;

    public SistemaDeRenta() {
        rentas=new ArrayList<Renta>(30);
        clientes=new ArrayList<Cliente>(30);

    }

    public void añadirRenta(Cliente cliente,Renta renta, Inventario inventario){
        clientes.add(cliente);
        rentas.add(renta);
        renta.recibo(inventario, cliente); }

    public void devolverRenta(int id){
        Renta renta;

        for(int i=0;i<rentas.size();i++){
            renta=rentas.get(i);
            if(id==(renta.getId()))
                rentas.remove(renta);
        }}

    public void buscarRenta(int id, Cliente cliente,Inventario inventario){
        Renta renta;

        for(int i=0;i<rentas.size();i++){
            renta=rentas.get(i);
            renta=rentas.get(i);
            if(id==renta.getId())
                renta.recibo(inventario, cliente);
        }
    }
}
