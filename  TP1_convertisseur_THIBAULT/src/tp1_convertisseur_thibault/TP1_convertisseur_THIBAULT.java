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
        double tempCelcius = (tempFarenheit - 32)*1.8;
        return tempCelcius;
     }
    
    //4
    public static double CelciusVersFarenheit ( double tempCelcius) {
        double tempFarenheit = tempCelcius*1.8 + 32;
        return tempFarenheit;
     }
    
    //5
    public static double KelvinVersFarenheit ( double tempKelvin) {
        double tempFarenheit = tempKelvin * 1.8 - 460;
        return tempFarenheit;
     }    

    //6
    public static double FarenheitVersKelvin ( double tempFarenheit) {
        double tempKelvin = (tempFarenheit + 460) / 1.8;
        return tempKelvin;
     }
    
    //MAIN
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double valeur ;
        System.out.println("Bonjour, saisissez une valeur réelle : ");
        valeur =sc.nextDouble();
        System.out.println(valeur);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        
        System.out.println("1) Celcius -> Kelvin ");
        System.out.println("2) Kelvin -> Celcius ");
        System.out.println("3) Farenheit -> Celcius ");
        System.out.println("4) Celcius -> Farenheit ");
        System.out.println("5) Kelvin -> Farenheit ");        
        System.out.println("6) Farenheit -> Kelvin ");        
        
        int convertion =sc.nextInt();
        
        
        double valeurC =0;
        double valeurK =0;
        double valeurF =0;
        
        //1
        if (convertion == 1){
            valeurK = CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à " +valeurK+" degrés Kelvin");            
            }
        
        //2
        if (convertion == 2){
            valeurC = KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à " +valeurC+" degrés Celcius");             
            }
        
              
        //3
        if (convertion == 3){
            valeurC = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à " +valeurC+" degrés Celcius");
            }
        

        //4
        if (convertion == 4){
            valeurF = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à " +valeurF+" Farenheit");
            }
        
    
        //5
        if (convertion == 5){
            valeurF = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à " +valeurF+" Farenheit");
            }

        //6
        if (convertion == 6){
            valeurK = FarenheitVersKelvin(valeur);
            System.out.println(valeur + " Farenheit est égal à " +valeurK+" degrés Kelvin ");
            }

          
    }
    
}

