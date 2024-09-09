package Tareasemana04;
import java.util.Scanner;
public class Tarea04{
    public static void main(String[]args){
        int num;
        String periodoaño="";
        Scanner lectura=new Scanner(System.in);
        //INGRESO DE DATOS
        System.out.print("periodo del año en numeros :");
        num=lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:periodoaño="Mensual"; break;
            case 2:periodoaño="Bimestral"; break;
            case 3:periodoaño="Trimestral"; break;
            case 4:periodoaño="Cuatrimestral"; break;
            case 6:periodoaño="Semestral"; break;
            case 12:periodoaño="Anual"; break;
        }
        //SALIDA DE DATOS
      System.out.println("El periodo ingresado es : "+periodoaño);
        
    }
    
}