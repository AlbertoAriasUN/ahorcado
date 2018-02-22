/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class HangMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al ahorcado");
        Scanner reader = new Scanner(System.in);
        
        String secret;
        System.out.println("Por favor escriba la palabra secreta: ");
        secret = reader.nextLine();
        
       // System.out.println("La palabra es: " + secret);
       System.out.println(secret.length()+" numero de letras de la palabra");
    }
    
}
