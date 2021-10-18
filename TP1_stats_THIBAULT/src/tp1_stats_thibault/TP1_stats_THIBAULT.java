/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_thibault;

/**
 *
 * @author paola
 */

import java.util.Random;
import java.util.Scanner;

public class TP1_stats_THIBAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        int nb_utilisateur;
        double [] Tab = new double[6];  
        System.out.println("Veuillez saisir un nombre entier inferieur ou égal à 6 :");
        nb_utilisateur = sc.nextInt();
        
        while (nb_utilisateur > 6) {
            System.out.println("Erreur: le nombre saisi est trop grand. \nVeuillez saisir un nombre entier inferieur ou égal à 6 :");
            nb_utilisateur = sc.nextInt();
        } 
        for (int i=0; i < nb_utilisateur ; i++) {
            Tab[i] = generateurAleat.nextInt(5);
            System.out.println(Tab[i]);
    }
    }
    
}
