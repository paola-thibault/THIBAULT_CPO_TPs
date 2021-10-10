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
        int niveau;
        
        int nb_max = 100;
        int nb_min = 0;
        
        System.out.println("À quel niveau de difficulté souhaitez-vous jouer ?");
        System.out.println("1) facile,\n2) normal, \n3) difficile");
        niveau = sc.nextInt();
        
        // niveau 1 :
        if (niveau == 1){
            nb_Alea = generateurAleat.nextInt(100);
            while (nb_ut != nb_Alea) {
                System.out.println("choisissez un nombre entre "+nb_min+" et "+nb_max +" :");
                nb_ut = sc.nextInt();

                
                
                if (nb_ut == nb_Alea){
                    System.out.println("GAGNÉ");
                    System.out.println("compteur = " + compteur);
                    }

                if (nb_ut > nb_Alea){
                    System.out.println("trop grand");
                    nb_max = nb_ut;
                    }

                if (nb_ut < nb_Alea){
                    System.out.println("trop petit"); 
                    nb_min = nb_ut;
                    }
                
                if (nb_ut > 1.5*nb_Alea){
                    System.out.println("VRAIMENT trop grand");
                    nb_max = nb_ut;
                    }

                if (nb_ut < 0.5*nb_Alea){
                    System.out.println("VRAIMENT trop petit");
                    if (nb_min < nb_ut){
                        System.out.println("nb_min : "+nb_min);
                        nb_min = nb_ut;
                    }
                    }

                compteur = compteur +1;
            }     
        }        
        
        
        // niveau 2:
        if (niveau == 2){
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
        
        
        // niveau 3:
        if (niveau == 3){
        nb_Alea = generateurAleat.nextInt(200);
        System.out.println("Vous disposez de 5 tentatives maximum... Bonne chance !");
            while (nb_ut != nb_Alea) {
                System.out.println("Choisissez un nombre entre 0 et 200 :");
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
                
                if (compteur > 5){
                    System.out.println("PERDU... plus de tentatives disponiblent.");
                }

                compteur = compteur +1;
            }     
        }        
        
        }
    }
    

