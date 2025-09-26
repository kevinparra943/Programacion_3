
package guia3;

import java.util.Scanner;


public class Guia3 {

 
    public static void main(String[] args) {
       int op;
       Scanner entrada= new Scanner (System.in);
       System.out.println("*** Bienvenido***");
       do{
        System.out.println("Escoja una de las siguientes opciones:");
        System.out.println("1. Cola de impresión \n 2. Robot explorador  \n 3. Salir");
         op= entrada.nextInt();
         switch (op){
            case 1 -> {
                   Impresora objeto = new Impresora();
                objeto.setVisible(true);
               
            }
            case 2 -> {
               Robot objeto = new Robot();
                objeto.setVisible(true);
                1
             
            }
         }
         
         }while(op!=3);
    }
    
}
