import java.util.ArrayList;

public class Inventario {
    private ArrayList<Carro> autos;
    private Carro auto;
    private Carro car;
    public Inventario() {
        autos=new ArrayList<Carro>(30);
        car=new Carro("Ninguno","Sin tipo","No aplica","**",0,0,0,0,0,0);

        auto=new Carro("Corolla","Sedan","Rojo","ZAU-135-U",452165,2010,200000,5,900,1);
        autos.add(auto);
        auto=new Carro("Altima","Sedan","Arena","AAA-AFZ",513489,2015,14000,5,1300,2);
        autos.add(auto);
        auto=new Carro("Sentra","Sedan","Azul Metalico","AGA-CYZ",724692,2019,10000,5,1900,3);
        autos.add(auto);
        auto=new Carro("Jetta","Sedan","Verde","CZA-DEZ",138252,2016,90000,5,1300,4);
        autos.add(auto);
        auto=new Carro("X-Trail","Camioneta","Gris Metalico","DFA-DKZ",934816,2011,34000,5,1200,5);
        autos.add(auto);
        auto=new Carro("Hilux","Camioneta","Carmesi","DTA-ETZ",743816,2020,65000,5,2500,6);
        autos.add(auto);
        auto=new Carro("Corolla","Sedan","Negro","DLA-DSZ",934544,2021,12000,5,3100,7);
        autos.add(auto);
        auto=new Carro("Altima","Sedan","Blanco","EUA-FPZ",125240,2019,73000,5,1700,8);
        autos.add(auto);
        auto=new Carro("Sentra","Sedan","Naranja","FRA-FWZ",431682,2015,68016,5,1100,9);
        autos.add(auto);
        auto=new Carro("Jetta","Sedan","Azul","A01-AAA",701380,2017,68246,5,1200,10);
        autos.add(auto);
        auto=new Carro("X-Trail","Camioneta","Blanco","Z99-ZZZ",943805,2018,68924,5,2000,11);
        autos.add(auto);
        auto=new Carro("Hilux","Camioneta","Naranja","FXA-GFZ",774656,2019,68425,5,2500,12);
        autos.add(auto);

        auto=new Carro("Corolla","Sedan","Verde","GGA-GYZ",388025,2021,16546,5,2700,13);
        autos.add(auto);
        auto=new Carro("Altima","Sedan","Rojo","GZA-HFZ",468056,2021,32546,5,2400,14);
        autos.add(auto);
        auto=new Carro("Sentra","Sedan","Amarillo","HGA-HRZ",706899,2018,68525,5,1900,15);
        autos.add(auto);
        auto=new Carro("Jetta","Sedan","Carmsi","HSA-LFZ",138282,2018,68354,5,1600,16);
        autos.add(auto);
        auto=new Carro("X-Trail","Camioneta","Cafe","LGA-PEZ",194383,2019,39452,5,2000,17);
        autos.add(auto);
        auto=new Carro("Hilux","Camioneta","Blanco","PFA-PUZ",707989,2018,95356,5,1900,18);
        autos.add(auto);
        auto=new Carro("Corolla","Sedan","Naranja","PVA-RDZ",385555,2013,150000,5,1300,19);
        autos.add(auto);
        auto=new Carro("Altima","Sedan","Morado","REA-RJZ",135422,2021,24521,5,2300,20);
        autos.add(auto);
        auto=new Carro("Sentra","Sedan","Gris","RKA-TGZ",139255,2014,68542,5,1400,21);
        autos.add(auto);
        auto=new Carro("Jetta","Sedan","Cafe","THA-TMZ",141542,2019,24625,5,1800,22);
        autos.add(auto);
        auto=new Carro("X-Trail","Camioneta","Azul","TNA-UJZ",335622,2018,56842,5,2400,23);
        autos.add(auto);
        auto=new Carro("Hilux","Camioneta","Negro","UKA-UPZ",920050,2016,68152,5,1800,24);
        autos.add(auto);



    }

    public void alta(Carro auto){
        autos.add(auto);
    }

    public void baja(int id){
        autos.remove(buscar(id));

    }

    public Carro buscar(int id){
        int j=0;
        for(int i=0;i<autos.size();i++){
            auto=autos.get(i);
            if(id==auto.getId()){
                i=autos.size();
                j=1;
            }}
        if(j==1)
            return auto;
        else return car;}

    public void rentar(int id){
        (buscar(id)).setDisponibilidad(false);    }

    public void imprimirLista(){
        for(int i=0;i<autos.size();i++){
            auto=autos.get(i);
            auto.imprimirA();}}

}
