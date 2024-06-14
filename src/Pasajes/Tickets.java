package Pasajes;

public class Tickets {
    private int IDticket;
    private String Fecha;

    private String Nombredelautobus;


    public Tickets(int IDticket, String Fecha , String Nombredelautobus){
        this.IDticket=IDticket;
        this.Fecha=Fecha;
        this.Nombredelautobus=Nombredelautobus;

    }

    public int getIDticket() {
        return IDticket;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getNombredelautobus() {
        return Nombredelautobus;
    }

    public  void MostrarDatos(){
        System.out.println("           Factura ");
        System.out.println("ID del ticket: "+IDticket);
        System.out.println("Fecha de salida del autobus: "+Fecha);
        System.out.println("Nombre de la compañia: "+ Nombredelautobus);


    }
}
