/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_v;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Calculadora_V {

    public static void main(String[] args) {
         double q=0, n1=0, n2=0;
        int dato=0;
       Brain objeto= new Brain();
       Scanner entrada= new Scanner (System.in);
       System.out.println("*** Bienvenido***");
       do{
        System.out.println("Escoja una de las siguientes opciones:");
        System.out.println("1. Suma \n 2. Resta \n 3.Multiplicacion \n 4. Division \n 5.Seno \n 6. Coseno\n 7.Tangente \n 8.Raiz enesima \n 9.Potencia \n 10.Salir");
         dato= entrada.nextInt();
        if(dato==5 || dato==6 || dato==7){
           
         System.out.println("Ingrese un numero para  la FT");
            q= entrada.nextDouble();
        }
        else {
            System.out.println("Ingrese el dato1 y el dato2");
        n1=entrada.nextInt();
         n2=entrada.nextInt();
         
                 
        }
       
        switch (dato){
            case 1:
                System.out.println("El resultado de la suma es: "+objeto.sumar(n1, n2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: "+objeto.restar(n1, n2));
                break;
            case 3:
                System.out.println("El resultado del coseno es: "+ objeto.multiplicar(n2, n2));
                break;
            case 4:
                System.out.println("El resultado de la suma es: "+objeto.dividir(n1, n2));
                break;
            case 5:
                System.out.println("El resultado de la resta es: "+objeto.seno(q));
                break;
            case 6:
                System.out.println("El resultado del coseno es: "+ objeto.coseno(q));
                break;
            case 7:
                System.out.println("El resultado del coseno es: "+ objeto.tangente(q));
                break;
                 case 8:
                System.out.println("El resultado de la raiz es: "+ objeto.raiz(n1 , n2));
                break;
            case 9:
                System.out.println("El resultado de la potencia es: "+ objeto.potencia(n1, n2));
                break;
    }
    }while(dato!=10);
    }
    }

