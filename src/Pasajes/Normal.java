package Pasajes;

public class Normal extends Tickets {
    private double CostoBase;


    public Normal( int IDticket, String Fecha , String Nombredelautobus, double CostoBase ){
        super(IDticket,  Fecha ,  Nombredelautobus);
        this.CostoBase=CostoBase;


    }

    public double getCostoBase() {
        return CostoBase;
    }

    @Override
    public  void MostrarDatos(){
        super.MostrarDatos();
        System.out.println(" El costo base del viaje es de:"+CostoBase+" sin contar con los servicios adicionales");

    }
}
