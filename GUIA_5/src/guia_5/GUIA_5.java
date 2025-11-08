/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_5;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author kevin
 */
public class GUIA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int aprobados = 5;
        int reprobados = 4;

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Aprobó", aprobados);
        dataset.setValue("Reprobó", reprobados);

        JFreeChart chart = ChartFactory.createPieChart(
            "Estadísticas de Mortalidad",
            dataset,
            true, true, false
        );

        try {
            ChartUtilities.saveChartAsJPEG(new File("estadisticas.jpg"), chart, 500, 300);
            System.out.println("Gráfico generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el gráfico.");
        }
    }

    }
    

