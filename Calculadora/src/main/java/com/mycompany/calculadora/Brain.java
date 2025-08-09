
package com.mycompany.calculadora;

/**
 *
 * @author kevin
 */
public class Brain {
    
    public  double r;
    
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
             r = Math.toRadians(a);
        return Math.sin(r);
    }
         public double coseno(double a){
              r = Math.toRadians(a);
        return  Math.cos(r);
    }
          public double tangente(double a){
           r = Math.toRadians(a);
        return  Math.tan(r);
    }
          public double porcentaje(double a, double b){
        return b*(a/100);
    }
}
