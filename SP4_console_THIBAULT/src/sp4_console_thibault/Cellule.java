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
        jetonCourant = false ; //false = pas de jeton
  
    }
    
    public boolean affecterJeton(Jeton entree) {
       jetonCourant = entree;
            
        }
    }
}
