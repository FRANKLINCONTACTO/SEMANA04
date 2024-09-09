package Tareasemana04;

import java.util.Scanner;
public class Tarea01 {
    public static void main(String[]args){
        int num;
        String Lecturamensaje="";
      Scanner lectura=new Scanner(System.in);
      //INGRESO DE DATOS
        System.out.print("ingresar numero en el rango del 1 al 5 : ");
        num=lectura.nextInt();
        //PROCESAR DATOS
        switch (num) {
            case 1:Lecturamensaje="uno"; break;
            case 2:Lecturamensaje="dos"; break;
            case 3:Lecturamensaje="tres"; break;
            case 4:Lecturamensaje="cuatro"; break;
            case 5:Lecturamensaje="cicno"; break;
        }
        // SALIDA DE DATOS
        System.out.println("El numero en lectura es : "+Lecturamensaje);
                  
    }  
}