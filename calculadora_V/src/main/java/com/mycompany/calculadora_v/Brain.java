/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_v;

/**
 *
 * @author kevin
 */
public class Brain {
    public  double cambio;
    //metodos
    public double sumar(double a, double b){
        return a+b;
    }
     public double restar(double a, double b){
        return a-b;
    }
      public double multiplicar(double a, double b){
        return a*b;
    }
       public double dividir(double a, double b){
        return a/b;
    }
        public double seno(double a){
             cambio = Math.toRadians(a);
        return Math.sin(cambio);
    }
         public double coseno(double a){
              cambio = Math.toRadians(a);
        return  Math.cos(cambio);
    }
          public double tangente(double a){
           cambio = Math.toRadians(a);
        return  Math.tan(cambio);
    }
          public double porcentaje(double a, double b){
        return b*(a/100);
    }
            public double potencia(double a, double b){
        return Math.pow(a, b);
          }
           public double raiz(double a, double b){
        return Math.pow(a, (1/b));
          }
}
