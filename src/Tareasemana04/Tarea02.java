package Tareasemana04;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[]args){
        int num;
        String Lecturamensaje="";
         Scanner lectura=new Scanner( System.in);
        //INGRESO DE DATOS
         System.out.print("numero del 1 al 10 :");
         num=lectura.nextInt();
         //PRROCESO DE DATOS
         switch (num) {
            case 1:Lecturamensaje="I"; break;
            case 2:Lecturamensaje="II"; break;
            case 3:Lecturamensaje="III"; break;
            case 4:Lecturamensaje="IV"; break;
            case 5:Lecturamensaje="V"; break;
            case 6:Lecturamensaje="VI"; break;
            case 7:Lecturamensaje="VII"; break;
            case 8:Lecturamensaje="VIII"; break;
            case 9:Lecturamensaje="IX"; break;
            case 10:Lecturamensaje="X"; break;
        }
         //SALIDA DE DATOS
         System.out.println("El numero en Romano es : "+Lecturamensaje);
    }
    
}