/*
 * OBJECTIF : réaliser un convertisseur de températures utilisant des méthodes.
 */
package tp1_convertisseur_thibault;

/**
 *
 * @author paola
 */

import java.util.Scanner;

public class TP1_convertisseur_THIBAULT {

    /**
     * @param args the command line arguments
     */
    
    public static double CelciusVersKelvin ( double tempCelcius) {
        double tempKelvin = tempCelcius + 273;
        return tempKelvin;
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double valeurC ;
        System.out.println("saisir une valeur réelle : ");
        valeurC =sc.nextDouble();
        System.out.println(valeurC);
        
        System.out.println("Kelvin : ");
        double valeurK = CelciusVersKelvin(valeurC);
        System.out.println(CelciusVersKelvin(valeurK));

    }
    
}

