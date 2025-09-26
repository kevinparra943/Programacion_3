/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia3;

/**
 *
 * @author kevin
 */
public class Documento {
     String nombre;
    int paginas;
    int actual = 0; // página actual
public Documento(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }
public boolean imprimirPagina() {
        if (actual < paginas) {
            actual++;
            return true; // todavía quedan páginas
        }
        return false; // documento terminado
    }
public boolean terminado() {
        return actual >= paginas;
    }

    public String getProgreso() {
        return "Página " + actual + " de " + paginas + " - Documento: " + nombre;
    }
}
