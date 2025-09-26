/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author kevin
 */
public class Tarea {
    private String tipo;
    private int duracion;
    private int progreso;
    
    public Tarea(String tipo, int duracion) {
        this.tipo = tipo;
        this.duracion = duracion;
        this.progreso = 0;
    }
    public String getTipo() { return tipo; }
    public int getDuracion() { return duracion; }
    public int getProgreso() { return progreso; }
    public boolean avanzar() {
        if (progreso < duracion) {
            progreso += 500;
            return true; // sigue en ejecución
        }
        return false; // terminó
    }

    public boolean terminada() {
        return progreso >= duracion;
    }
}
