package Pasajes;

import javax.swing.plaf.PanelUI;

public class Vip extends Normal{
    private double CostoVip;



    public Vip(int IDticket, String Fecha , String Nombredelautobus, double CostoBase, double costoVip){
        super(IDticket,  Fecha ,  Nombredelautobus,CostoBase);
        this.CostoVip=CostoVip;

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
        System.out.println(" El costo base del viaje es de:"+CostoVip+" contando con los servicios adicionales");

    }
}
