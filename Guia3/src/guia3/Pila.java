/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;
import java.util.Stack;
/**
 *
 * @author kevin
 */
public class Pila {
    private Stack<Tarea> pila = new Stack<>();
    private Tarea enEjecucion = null;
    
    public void agregarTarea(Tarea tarea) {
        if (enEjecucion == null) {
            enEjecucion = tarea;
        } else {
            pila.push(tarea);
        }
    }
    public Tarea getEnEjecucion() {
        return enEjecucion;
    }
    public boolean avanzar() {
        if (enEjecucion == null) {
            if (pila.isEmpty()) return false;
            enEjecucion = pila.pop(); //accion de pila
        }
        if (enEjecucion.avanzar()) {
            return true; // sigue ejecutando
        } else {
            enEjecucion = null; // terminó, listo para la siguiente
            return false;
        }
    }
    public boolean vacia() {
        return enEjecucion == null && pila.isEmpty();
    }

    public int tareasPendientes() {
        return pila.size();
    }

    public Stack<Tarea> getPila() {
        return pila;
    }
    
    
    
}
