/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_5;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Estudiante {
    String nombre;
    ArrayList<Double> notas;

    public Estudiante(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
       for (int i = 0; i < notas.size(); i++) {
    suma += notas.get(i);
}
        return suma / notas.size();
    }

}
