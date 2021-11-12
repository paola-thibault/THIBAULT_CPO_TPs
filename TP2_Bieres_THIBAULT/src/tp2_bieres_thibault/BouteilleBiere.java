/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_thibault;
    
/**
 *
 * @author paola
 */
public class BouteilleBiere {
    String nom = " "; 
    float degreAlcool ;
    String brasserie ;
    boolean ouverte ;
    /***ouverte = boolean("false");
     * 
     */
    
    void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    
    BouteilleBiere uneBiere = new BouteilleBiere() ;
    uneBiere.nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ;
}
    
    public boolean Décapsuler() { 
        if (ouverte == false) {
            System.out.println("pop");
            ouverte = true;
            return ouverte;
            }   
        else {
            System.out.println("erreur: bière deja ouverte");
            return false;
            }
        }
    
    @Override //écrase la methode toString pour creer une nouvelle methode
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)\nOuverte ? "; //nom est inclu dans biere_douy_gaubil.BouteilleBiere@65ab7765, toString cherche la valeur du nom dedans
        if (ouverte == true) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;                  
    }
    }
