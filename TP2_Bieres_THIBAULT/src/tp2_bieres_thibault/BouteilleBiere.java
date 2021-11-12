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
    double degreAlcool ;
    String brasserie ;
    boolean ouverte ;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
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
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)\nOuverte ? "; //nom est inclu dans tp2_bieres_thibault, toString cherche la valeur du nom dedans
        if (ouverte == true) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;                  
    }
    }
