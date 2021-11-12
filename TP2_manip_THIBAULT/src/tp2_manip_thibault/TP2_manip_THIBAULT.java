/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_thibault;

/**
 *
 * @author paola
 */
public class TP2_manip_THIBAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(800) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        // on constate qu'on a créée seulement 2 assiettes de kcal differentes. assiette3 et assiette2 reference la meme tartiflette.
        
        Tartiflette assiette_temp = assiette1;
        assiette1 = assiette2 ;
        assiette2 = assiette_temp ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;        
        
        //Moussaka assiette666 = assiette1 ; 
        //Moussaka assiette667 = new Tartiflette() ;
        // aucune des 2 proposition n'est juste. Une référence objet qne peut pas référencer un autre type d’objet qui n’a aucun rapport 
    }
    
}
