/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int op;
       Scanner entrada= new Scanner (System.in);
       System.out.println("*** Bienvenido***");
       do{
        System.out.println("Escoja una de las siguientes opciones:");
        System.out.println("1. juego \n Salir");
         op= entrada.nextInt();
         switch (op){
            case 1 -> {
                   GUI objeto = new GUI();
                objeto.setVisible(true);
               
            }
          
         }
         
         }while(op!=3);
    }
    }
    

