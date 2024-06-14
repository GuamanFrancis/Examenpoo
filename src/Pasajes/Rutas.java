package Pasajes;

public class Rutas extends Pasajeros{
    private String Rutas;
    private String Q_G= "Quito_Guayaquil";
    private String Q_C="Quito_Cuenca";
    private String Q_P ="Quito_Puyo";
    private String Q_R="Quito_Riobamba";
    private double pasajeQ_G= 20;
    private double pasajeQ_C=17.50;
    private double pasajeQ_P=15 ;
    private double pasajeQ_R=17.50 ;

    public Rutas(int IDticket, String Fecha , String Nombredelautobus, String Nombre, int Edad, int Cedula ){
        super( IDticket,  Fecha , Nombredelautobus,  Nombre,  Edad,  Cedula);
        this.pasajeQ_P=pasajeQ_P;
        this.pasajeQ_C=pasajeQ_C;
        this.pasajeQ_R=pasajeQ_R;
        this.pasajeQ_G=pasajeQ_G;


    }

    //@Override
    public void MostrarDatos( ){
        super.MostrarDatos();
        String op="";
        if(op==Q_G){

            System.out.println("Su destino es: QuitoGuayaquil");
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_G);

        } else if (op==Q_R){
            System.out.println("Su destino es: Quito_Riobamba");
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_R);

        }else if (op==Q_P){
            System.out.println("Su destino es: Quito_Puyo");
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_P);

        }else if (op==Q_C){
            System.out.println("Su destino es: Quito_Guayaquil");
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_C);
        }
    }

}
