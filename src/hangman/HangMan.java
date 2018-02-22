/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author Edwin Alberto Arias
 */
public class HangMan {

    /**
     * @param args the command line arguments
     */
    private static String[] palabras = {"cometa", "prueba", "cadena", "panaderia" };
    private static String palabra = palabras[(int) (Math.random() * palabras.length)];
    private static String rayita = new String(new char[palabra.length()]).replace("\0", "_ ");
    private static int count = 0;
    public static void main(String[] args) {
        System.out.println("Bienvenido al ahorcado");
        
        
        System.out.println("La palabra es: " + rayita);
        
        
        
       // System.out.println("La palabra es: " + secret);
       //System.out.println(secret.length()+" numero de letras de la palabra");
       //System.out.println("escriba una letra: ");
    }
    
}
