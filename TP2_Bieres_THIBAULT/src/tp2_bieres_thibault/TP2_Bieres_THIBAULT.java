/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_thibault;

/**
 *
 * @author paola
 */
public class TP2_Bieres_THIBAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneBiere2 = new BouteilleBiere();
        uneBiere2.nom = "leffe";
        uneBiere2.degreAlcool = 6.6f;
        uneBiere2.brasserie = "Abbaye de Leffe";
        uneBiere2.lireEtiquette();
        */
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
                
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        uneBiere2.lireEtiquette();
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("1664", 5.5f, "Le Canon \n");
        uneBiere3.lireEtiquette();
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("Pelforth", 5.8f, "Mons-en-baroeuf \n");
        uneBiere4.lireEtiquette();
        
        uneBiere4.Décapsuler();
        uneBiere4.Décapsuler();
        
        //System.out.println(uneBiere4); 
        
        BouteilleBiere uneBiere5 = new BouteilleBiere("Barile White", 4.9f, "Baril sur Brest \n");
        uneBiere5.lireEtiquette();
        uneBiere5.Décapsuler();
        uneBiere5.Décapsuler();
        System.out.println(uneBiere5);
        
    }
    
}
