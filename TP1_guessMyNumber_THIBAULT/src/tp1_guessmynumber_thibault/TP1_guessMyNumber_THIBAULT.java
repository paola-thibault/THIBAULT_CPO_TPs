/*
OBJECTIF : réaliser un jeu de type « Guess My Number » : 
un nombre aléatoire est choisi, l’utilisateur doit le deviner.
*/
package tp1_guessmynumber_thibault;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author paola
 */
public class TP1_guessMyNumber_THIBAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nb_Alea;  
        int nb_ut = 101;
        int compteur = 0;
        
        nb_Alea = generateurAleat.nextInt(100);
        while (nb_ut != nb_Alea) {
            System.out.println("choisissez un nombre entre 0 et 100 :");
            nb_ut = sc.nextInt();
        
            if (nb_ut == nb_Alea){
                System.out.println("GAGNÉ");
                System.out.println("compteur = " + compteur);
                }

            if (nb_ut > nb_Alea){
                System.out.println("trop grand");
                }

            if (nb_ut < nb_Alea){
                System.out.println("trop petit");
                }
            
            compteur = compteur +1;
        } 
        }
    }
    

