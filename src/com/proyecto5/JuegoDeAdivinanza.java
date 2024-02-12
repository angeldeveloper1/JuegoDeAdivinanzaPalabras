package com.proyecto5;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Juego de adivinanza de palabras. Pasamos lista de palabras al programa
 * hacer que el usuario adivine las palabras de esa lista.
 * También indicaría cuantas palabras ha adivinado.
 * Clase JuegoDeAdivinanza que contiene metodos y una declaracion de una variable de instancia llamada "palabras"
 */
public class JuegoDeAdivinanza {
    // variable de instancia palabras de tipo HashSet<String>.
    // Coleccion que contiene elementos de tipo String y garantiza la ausencia de duplicados
    private HashSet<String> palabras = new HashSet<>();
    /**
     * Constructor de la clase JuegoDeAdivinanza
     * @param palabras Lista de palabras a adivinar
     */
    public JuegoDeAdivinanza(HashSet<String> palabras) {
        for (String palabra : palabras) {
            this.palabras.add(palabra.toLowerCase());
        }
    }
    /**
     * Metodo que juega el juego de adivinanza
     */
    public void jugar(){
        Scanner input = new Scanner(System.in);
        int contador=0;
        System.out.println("Juego de adivinanza de palabras!");
        System.out.println("Hay " +palabras.size() + " palabras en total");
        /*
        While si la coleccion no esta vacia, entra al bucle
        Si la coleccion esta vacia, sale del bucle
         */
        while (!palabras.isEmpty()){
            System.out.println("Adivina la palabra: ");
            String palabra = input.nextLine().toLowerCase();
            // Verifica si la palabra que ingresa el usuario esta en la coleccion
            if (palabras.contains(palabra)){
                // Elimina la palabra adivinada
                palabras.remove(palabra);
                // suma puntos
                contador++;
                System.out.println("Correcto! llevas " +contador + " adivinados");
            } else {
                System.out.println("Incorrecto. Intenalo nuevamente");
            }
        }
        System.out.println("Ha adivinado los " +contador + " palabras, felicidades!");
    }

}
