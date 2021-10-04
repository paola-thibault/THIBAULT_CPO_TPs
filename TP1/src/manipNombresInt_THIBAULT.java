/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paola
 */

import java.util.Scanner;

public class manipNombresInt_THIBAULT {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1 =0;
                
        System.out.println("Saisissez 2 entiers :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entier n°1 : ");
        nb1=sc.nextInt();
        System.out.println("Entier n°2 : ");
        int nb2=sc.nextInt();
        
        int addition = nb1 + nb2;
        int soustraction = nb1 - nb2;
        int produit = nb1 * nb2;
        double quotient = (nb1*(1.0) / nb2);
        int mod = nb1 % nb2;
        
        System.out.println("Somme : " +nb1+ "+" +nb2 + " = " + addition);
        System.out.println("Soustraction : " +nb1+ "-" +nb2 + " = " + soustraction);
        System.out.println("Produit : " +nb1+ "*" +nb2 + " = " + produit);
        System.out.println("Quotient : " +nb1+ "*" +nb2 + " = " + quotient);
        System.out.println("Reste de la divion = " + mod);
    }
}