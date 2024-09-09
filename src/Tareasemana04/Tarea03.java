package Tareasemana04;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[]args){
        int num;
        String Lecturamensaje="";
        Scanner lectura=new Scanner(System.in);
        //INGRESO DE DATOS
        System.out.print("ingrese un numero del 1 al 6: ");
        num=lectura.nextInt();
        switch (num) {
            case 1:Lecturamensaje="One";
            break;
            case 2:Lecturamensaje="Two";
            break;
            case 3:Lecturamensaje="Three";
            break;
            case 4:Lecturamensaje="Four";
            break;
            case 5:Lecturamensaje="Five"; 
            break;
            case 6:Lecturamensaje="Six";
            break;
   }
        //SALIDA DE DATOS
        System.out.println("El numero ingresado en ingles es : "+Lecturamensaje);
    }
    
}