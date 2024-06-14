package Pasajes;

public class Normal extends Rutas {
    private double CostoBase;


    public Normal( int IDticket, String Fecha , String Nombredelautobus, double CostoBase, String Nombre, int Edad, int Cedula ){
        super(IDticket,  Fecha ,  Nombredelautobus,  Nombre,  Edad,  Cedula);
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
