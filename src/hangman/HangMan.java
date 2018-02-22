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
        System.out.println("Hello, welcome to HANG MAN");
        Scanner reader = new Scanner(System.in);
        
        String secret;
        
        System.out.println("Please introduce a secret word: ");
        secret = reader.nextLine();
        
        System.out.println("the word introduce is: " + secret);
    }
    
}
