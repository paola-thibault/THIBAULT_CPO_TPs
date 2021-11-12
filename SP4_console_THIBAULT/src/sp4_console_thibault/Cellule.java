/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thibault;

/**
 *
 * @author paola
 */
public class Cellule {
    Jeton jetonCourant ;
    boolean trouNoir ;
    boolean desintegrateur;
    
    public Cellule() {
        jetonCourant = null ; //false = pas de jeton
        trouNoir = false;
        desintegrateur = false ;      
    }
    
    public boolean affecterJeton(Jeton entree) {
        if (jetonCourant == null) {
            jetonCourant = entree;
            return true;
        }
            else {
                 return false;   
                    }
    }
    
    public Jeton recupererJeton() {
        return jetonCourant;
    }
    
    
    public boolean supprimerJeton() {
        
    }
}
