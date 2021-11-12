/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_thibault;

/**
 *
 * @author paola
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons = new Jeton[21];
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
    public Joueur(String nomJ){
        Nom = nomJ;
    }
    
    public void affecterCouleur (String couleurJ){
        Couleur = couleurJ;
    }
    
    public boolean ajouterJeton (Jeton jetonJ){
        int i =0;
        while (ListeJetons[i] != null){
            i = i+1;
            if (i == 20){
                return false;
            }
        }
        ListeJetons[i] = jetonJ ;
        return true;
    }
    
    public void obtenirDesintegrateur (){   
    }
    
    public boolean utiliserDesintegrateur(){   
    }
    
}
