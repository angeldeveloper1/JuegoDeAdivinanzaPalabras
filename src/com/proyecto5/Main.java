package com.proyecto5;

import java.util.HashSet; // Importa la clase HashSet del paquete java.util

/**
 * Clase main para hacer la ejecucion
 */
public class Main {

    public static void main(String[] args) {

        // Creacion de un HashSet llamado "palabra" para almacenar palabras
        HashSet<String> palabra = new HashSet<>();

        // Agrega algunas palabras al HashSet
        palabra.add("gato");
        palabra.add("perro");
        palabra.add("tortuga");
        palabra.add("leon");

        // Crea una instancia de la clase JuegoDeAdivinanza, pasando el HashSet de palabras como argumento
        JuegoDeAdivinanza juego = new JuegoDeAdivinanza(palabra);

        // Llama al método "jugar()" en la instancia de JuegoDeAdivinanza para iniciar el juego
        juego.jugar();

    }

}