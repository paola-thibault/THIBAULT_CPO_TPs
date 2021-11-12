/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_thibault;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class TP2_convertisseurObjet_THIBAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        
        float temperature;
        temperature = sc.nextFloat();
        Convertisseur convertisseur1 = new Convertisseur();
        System.out.println(convertisseur1.CelciusVersKelvin(temperature));
        convertisseur1.KelvinVersCelcius(temperature); 
        convertisseur1.CelciusVersFarenheit(temperature);
        System.out.println(convertisseur1);
    }
    
}
