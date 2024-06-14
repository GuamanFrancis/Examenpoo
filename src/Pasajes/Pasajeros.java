package Pasajes;

public class Pasajeros extends Tickets{
    private String Nombre;
    private  int Edad;
    private int Cedula;


    public Pasajeros(int IDticket, String Fecha , String Nombredelautobus, String Nombre, int Edad, int Cedula){
        super(IDticket,  Fecha ,  Nombredelautobus);
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Cedula=Cedula;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Datos Pasajero ");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cedula: "+getCedula());


    }

}
