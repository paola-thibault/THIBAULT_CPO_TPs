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
    
    //1
    public static double CelciusVersKelvin ( double tempCelcius) {
        double tempKelvin = tempCelcius + 273;
        return tempKelvin;
     }
    
    //2
    public static double KelvinVersCelcius ( double tempKelvin) {
        double tempCelcius = tempKelvin - 273;
        return tempCelcius;
     }    
    
    
    //3
    public static double FarenheitVersCelcius ( double tempFarenheit) {
        double tempCelcius = tempFarenheit + 32;
        return tempCelcius;
     }
    
    //4
    public static double CelciusVersFarenheit ( double tempCelcius) {
        double tempFarenheit = tempCelcius - 32;
        return tempFarenheit;
     }
    
    //5
    public static double KelvinVersFarenheit ( double tempKelvin) {
        double tempFarenheit = tempKelvin * 1.8 - 460;
        return tempFarenheit;
     }    

    //6
    public static double FarenheitVersKelvin ( double tempFarenheit) {
        double tempKelvin = (tempFarenheit + 459.67) / 1.8;
        return tempKelvin;
     }
    
    //MAIN
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double valeur ;
        System.out.println("saisir une valeur réelle : ");
        valeur =sc.nextDouble();
        System.out.println(valeur);
        
        
        
        double valeurC =0;
        double valeurK =0;
        double valeurF =0;
        
        //1
        System.out.println("Celcius -> Kelvin : ");
        valeurK = CelciusVersKelvin(valeur);
        System.out.println(valeurK);

        //2
        System.out.println("Kelvin -> Celcius : ");
        valeurC = KelvinVersCelcius(valeur);
        System.out.println(valeurC);
              
        //3
        System.out.println("Farenheit -> Celcius : ");
        valeurC = FarenheitVersCelcius(valeur);
        System.out.println(valeurF);

        //4
        System.out.println("Celcius -> Farenheit : ");
        valeurF = CelciusVersFarenheit(valeur);
        System.out.println(valeurF);
    
        //5
        System.out.println("Kelvin -> Farenheit : ");
        valeurF = KelvinVersFarenheit(valeur);
        System.out.println(valeurF);
       
        //6
        System.out.println("Farenheit -> Kelvin : ");
        valeurK = FarenheitVersKelvin(valeur);
        System.out.println(valeurK);
        
        
    }
    
}

