import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Inventario inventario=new Inventario();
        SistemaDeRentaVerdadero sistema=new SistemaDeRentaVerdadero();
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            int id;
            System.out.println("\nDesea realizar alguna renta o devolucion?"
                    + "\n1. Si"
                    + "\n2. No");
            op = sc.nextInt();
            if(op==1){
                System.out.println("Bienvenido a super autos rentas \n"
                        + "\nSeleccione la opcion deseada"
                        + "\nCliente"
                        + "\n1. Rentar auto"
                        + "\n2. Devolver auto"
                        + "-------------------------------"
                        + "Cajero"
                        + "\n3. Dar de baja un auto"
                        + "\n4. Dar de alta un auto.");
                int opc = sc.nextInt();
                switch(op){
                    case 1: inventario.toString();
                        sistema.añadirRenta(registro(),SistemaDeRenta(),inventario);
                        break;


                    case 2: sistema.devolverRenta(id());
                        break;


                    case 3: inventario.baja(id());
                        break;

                    case 4: inventario.alta(alta());
                        break;


                }
            }
            else System.out.println("\nGracias por acceder a nuestro sistema de rentas, vuleva pronto");
        }
        while(op==1);
    }
    public static Cliente registro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese su nombre\n");
        String nombre = sc.nextLine();
        System.out.println("\nIngrese su edad\n");
        int edad=sc.nextInt();
        System.out.println("\nIngrese su numero celular\n");
        int numCelular=sc.nextInt();
        Cliente cliente=new Cliente(nombre,edad,numCelular);
        return cliente;}


    public static SistemaDeRenta renta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese la fecha de salida\n");
        String fechaR = sc.nextLine();
        System.out.println("\nIngrese la fecha de entrega\n");
        String fechaD = sc.nextLine();
        System.out.println("\nIngrese la ciudad de salida \n");
        String ciudadR = sc.nextLine();
        System.out.println("\nIngrese la ciudad de llegada \n");
        String ciudadD = sc.nextLine();
        System.out.println("\nIngrese el numero de dias que requiere el vehiculo \n");
        int dias = sc.nextInt();
        System.out.println("\nIngrese el numero del ID del vehiculo que desea rentar \n");
        int id = sc.nextInt();
        SistemaDeRenta renta=new SistemaDeRenta(fechaR,fechaD,ciudadR,ciudadD,dias,id);
        return renta;}

    public static int id(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del vehiculo");
        int id = sc.nextInt();
        return id;}

    public static Carro alta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el modelo del vehiculo");
        String modelo = sc.nextLine();
        System.out.println("Ingrese el tipo de vehiculo");
        String tipo = sc.nextLine();
        System.out.println("Ingrese el color del vehiculo");
        String color= sc.nextLine();
        System.out.println("Ingrese el matricula del vehiculo");
        String matricula= sc.nextLine();
        System.out.println("Ingrese el numero de serie del vehiculo");
        int numSerie = sc.nextInt();
        System.out.println("Ingrese el año del vehiculo");
        int año = sc.nextInt();
        System.out.println("Ingrese el numero de pasajeros del vehiculo");
        int numPasajeros = sc.nextInt();
        System.out.println("Ingrese el kilometraje del vehiculo");
        int kilometraje = sc.nextInt();
        System.out.println("Ingrese el costo de renta por dia del vehiculo");
        int costoRenta = sc.nextInt();
        System.out.println("Ingrese el ID del vehiculo");
        int id = sc.nextInt();

        Carro alta=new Carro(modelo,tipo,color,matricula,numSerie,año,numPasajeros,kilometraje,costoRenta,id);
        return alta;}

}

