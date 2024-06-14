import Pasajes.Pasajeros;
import Pasajes.Rutas;
import Pasajes.Tickets;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Rutas p1 = new Rutas(1000,"14/06/2024","FlotaPichincha","Quito_Guayaquil",20,"Quito_Tulcan",17.50,"Quito_Puyo",15,"Quito_Riobamba",17.50);



        int Nombre;
        System.out.println("Ingrese una de las opciones ");
        System.out.println("1.Q-G");
        System.out.println("2.Q-R");
        System.out.println("3.Q-T ");
        System.out.println("4.Q-C");
        Nombre = a.nextInt();

        p1.MostrarDatos(Nombre);






    }
}