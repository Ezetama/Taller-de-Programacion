/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author tamam
 */
public class Ej4P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReporteAnual report = new ReporteAnual("LeoLandia", -20.420, 420.20, 2021, 3);
        report.setTemperatura(2022, 1, 500);
        report.setTemperatura(2023, 4, 420);
        System.out.println (report.toString());
        System.out.println (report.mayorTemp());
        //-------------------------------------------
        ReporteMensual report2 = new ReporteMensual ("Ezelandia",-38.002,-57.556,2020,4);
        System.out.println (report2.toString());
        report2.setTemperatura(2023, 12, 30);
        report2.setTemperatura(2022, 2, 95);
        System.out.println (report2.toString());
        System.out.println (report2.mayorTemp());
    }
    
}
