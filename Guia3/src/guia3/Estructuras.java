
package guia3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author kevin
 */
public class Estructuras {
    Queue<Documento> cola = new LinkedList<>();
    Documento enImpresion = null;
    public void agregarDocumento(Documento doc){
    cola.add(doc);
    }
 public Documento getEnImpresion() {
        return enImpresion;
    }
 public boolean avanzarImpresion() {
        if (enImpresion == null) {
            if (cola.isEmpty()) {
                return false; //no hay nada
            }
            enImpresion = cola.poll();
        }
        if (enImpresion.imprimirPagina()) {
            return true; // sigue imprimiendo
        } else {
            enImpresion = null; // documento terminado, listo para el siguiente
            return false;
        }
 }
 public boolean colaVacia() {
        return cola.isEmpty() && enImpresion == null;
    }
}
