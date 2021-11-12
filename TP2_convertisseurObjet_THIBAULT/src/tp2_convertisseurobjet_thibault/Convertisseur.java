/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_thibault;

/**
 *
 * @author paola
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur() {
        nbConversions = 0;
    }
    
    public float CelciusVersKelvin ( float tempCelcius) {
        float tempKelvin;                             
        tempKelvin = tempCelcius + 273.15f;//en rajoutant un 'f' à la fin d'un nombre on peut le transformer en float
        nbConversions = nbConversions + 1;
        return(tempKelvin + nbConversions); 
    } 

    public float KelvinVersCelcius ( float tempKelvin) {
        float tempCelcius;                             
        tempCelcius = tempKelvin - 273.15f;
        nbConversions = nbConversions + 1;
        return(tempCelcius + nbConversions);        
    }
    
    public float FarenheitVersCelcius ( float tempFarenheit) {
        float tempCelcius;                             
        tempCelcius = tempFarenheit - 32.0f * 5.0f/9;
        nbConversions = nbConversions + 1;
        return(tempCelcius + nbConversions);
    }
    
    public float CelciusVersFarenheit ( float tempCelcius) {
        float tempFarenheit;                             
        tempFarenheit = tempCelcius * (9.0f)/5.0f + 32.0f;
        nbConversions = nbConversions + 1;
        return(tempFarenheit + nbConversions);
    }
        
    public float FarenheitVersKelvin ( float tempFarenheit) {
        float tempKelvin;                             
        tempKelvin = 459.67f + tempFarenheit*(5.0f/9.0f);
        return(tempKelvin + nbConversions);
    }
    
    public float KelvinVersFarenheit ( float tempKelvin) {
        float tempFarenheit;                             
        tempFarenheit = tempKelvin * (9.0f)/5.0f - 459.67f;
        nbConversions = nbConversions + 1;
        return(tempFarenheit + nbConversions);
    }
    
    @Override //écrase la methode toString pour creer une nouvelle methode
    public String toString() {
        return "nbde conversions"+ nbConversions;                   
    }
}

