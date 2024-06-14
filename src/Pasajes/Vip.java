package Pasajes;

import javax.swing.plaf.PanelUI;

public class Vip extends Normal{
    private double CostoVip;



    public Vip(int IDticket, String Fecha , String Nombredelautobus, double CostoBase, String Nombre, int Edad, int Cedula){
        super(IDticket,  Fecha ,  Nombredelautobus,CostoBase,  Nombre,  Edad,  Cedula);


    }

    public double getCostoVip() {
        return CostoVip;
    }

    public double TotalVip(){
        return getCostoVip()+getCostoBase();

    }


        @Override
    public  void MostrarDatos(){

        super.MostrarDatos();
        CostoVip=getCostoBase()*0.30;
        System.out.println(" El costo base del viaje es de:"+(getCostoVip()+getCostoBase()));
        System.out.println("En este servicio cuenta con  Television, internet y otros 2 servicios adicionales a su consideracion");
            System.out.println("Espacio para una maleta");
            System.out.println("Opción a una maleta adicional por costo extra");

    }
}
