import Pasajes.*;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Vip persona1 = new Vip(1000,"14/06/2024","FlotaPichincha",50,"Francis",23,1755991415);
        Normal Persona2 = new Normal(2000,"14/06/2024","TransNacional",50,"Juan",20,1755882016);
        Vip persona3 = new Vip(5000,"14/06/2024","FlotaEcuador",50,"Pedro",19,1755991456);
        Vip persona4 = new Vip(4000,"14/06/2024","FlotaPichincha",50,"Julian",18,175599259);
        Vip persona5 = new Vip(7000,"14/06/2024","TransNacional",50,"Maria",21,1755991123);
        Normal persona6 = new Normal(9000,"14/06/2024","TransEcuador",50,"Ana",15,1755882789);




        persona1.MostrarDatos();
        Persona2.MostrarDatos();
        persona3.MostrarDatos();
        persona4.MostrarDatos();
        persona5.MostrarDatos();
        persona6.MostrarDatos();






    }
}