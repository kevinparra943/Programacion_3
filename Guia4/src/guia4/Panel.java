package guia4;
import java.awt.Graphics;
import java.awt.Color;


/**
 *
 * @author kevin
 */
public class Panel extends javax.swing.JPanel {
int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,x7=0,x8=0,x9=0,x10=0;

    public Panel() {
        initComponents();
    }
protected void paintComponent(Graphics p) {
     super.paintComponent(p);
      Color grisClaro = new Color(200, 200, 200);
      setBackground(grisClaro);
     
     Color negro = Color.BLACK;
       
        
     for(int i=0;i<20;i++){
         
         p.setColor(negro);
        p.fillRect(765,i*30 ,15,15);
         
     }
for(int i=15;i<600;i=i+30){
         
         p.setColor(negro);
        p.fillRect(780,i ,15,15);
         
     }
     
     int pixel = 5;
     dibujarCarro(p, -10+x1, 10, pixel, new Color(0, 200, 0));    // Verde
     dibujarCarro(p, -10+x2, 50, pixel, new Color(0, 100, 255)); // Azul
     dibujarCarro(p, -10+x3, 90, pixel, new Color(220, 0, 0));   // Rojo
     dibujarCarro(p, -10+x4, 130, pixel, new Color(180, 140, 80)); // Marrón 
     dibujarCarro(p, -10+x5, 170, pixel, new Color(255, 255, 0));    // amarilllo
     dibujarCarro(p, -10+x6, 210, pixel, new Color(0, 255, 255)); // Cian
     dibujarCarro(p, -10+x7, 250, pixel, new Color(255, 0, 255));   // magenta
     dibujarCarro(p, -10+x8, 290, pixel, new Color(255, 165, 0)); // naranja
     dibujarCarro(p, -10+x9, 330, pixel, new Color(255, 192, 203));    // rosa  
     dibujarCarro(p, -10+x10, 370, pixel, new Color(143, 188, 143)); // verde gris

}
private void dibujarCarro(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
/*private void dibujarCarro2(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro3(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro4(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro5(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro6(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro7(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro8(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro9(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}
private void dibujarCarro10(Graphics p, int x, int y, int size, Color colorCarro) {
        Color negro = Color.BLACK;
        Color grisClaro = new Color(200, 200, 200);
       
        // Cuerpo
        p.setColor(colorCarro);
        p.fillRect(x + size, y + size, size, 3*size);
        p.fillRect(x+ 2 * size, y , 4 * size, 5 * size);
        
        // Ventana 
        p.setColor(grisClaro);
        p.fillRect(x + 3 * size, y + size, 2 * size, 3 * size);
         
        // Llantas 
        p.setColor(negro);
        p.fillRect(x + 2 * size, y-size,2 * size,  size);
        p.fillRect(x + 2 * size, y + 5 * size, 2 *size,  size);
        
         // parte delantera
        p.setColor(colorCarro);
        p.fillRect(x + 6 * size, y +size,  size, 3 *size);   
}*/
public void X(int i, int t) {
    switch(i) {
        case 0: x1 = t; break;
        case 1: x2 = t; break;
        case 2: x3 = t; break;
        case 3: x4 = t; break;
        case 4: x5 = t; break;
        case 5: x6 = t; break;
        case 6: x7 = t; break;
        case 7: x8 = t; break;
        case 8: x9 = t; break;
        case 9: x10 = t; break;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
