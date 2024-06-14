package Pasajes;

public class Rutas extends Pasajeros{
    private String Quito_Guayaquil;
    private double pasajeQ_G;
    private String Quito_Tulcán;
    private double pasajeQ_C;
	private String Quito_Puyo;
    private double pasajeQ_P ;
    private String Quito_Riobamba;
    private double pasajeQ_R ;

    public Rutas(int IDticket, String Fecha , String Nombredelautobus,String Quito_Guayaquil,double pasajeQ_G,String Quito_Tulcán,double pasajeQ_C, String Quito_Puyo, double pasajeQ_P , String Quito_Riobamba, double pasajeQ_R ){
        super( IDticket,  Fecha , Nombredelautobus );
        this.Quito_Guayaquil=Quito_Guayaquil;
        this.Quito_Tulcán=Quito_Tulcán;
        this.Quito_Puyo=Quito_Puyo;
        this.Quito_Riobamba= Quito_Riobamba;
        this.pasajeQ_P=pasajeQ_P;
        this.pasajeQ_C=pasajeQ_C;
        this.pasajeQ_R=pasajeQ_R;
        this.pasajeQ_G=pasajeQ_G;


    }

    //@Override
    public void MostrarDatos(int op ){
        super.MostrarDatos();
        if(op==1){
            System.out.println("Su destino es: "+Quito_Guayaquil);
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_G);

        } else if (op==2){
            System.out.println("Su destino es: "+Quito_Riobamba);
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_R);

        }else if (op==3){
            System.out.println("Su destino es: "+Quito_Puyo);
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_P);

        }else if (op==4){
            System.out.println("Su destino es: "+Quito_Tulcán);
            System.out.println(" Su valor de pasaje es de: "+pasajeQ_C);

        }else {

            System.out.println("No existe ninguna esa opcion");

        }
    }

}
