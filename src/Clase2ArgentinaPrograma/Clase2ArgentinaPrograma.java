/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2ArgentinaPrograma;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static Clase2ArgentinaPrograma.Interface.cambiarAMayus;

/**
 *
 * @author Franco Scaramuzzino
 */
public class Clase2ArgentinaPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> listaDeCadenas = Arrays.asList("Hola", "Mundo", "Java");

        // Define:función lambda
        Function<String, String> transformadorMayusculas = input -> input.toUpperCase();

        // Utilizar: función lambda para transformar
        List<String> listaEnMayusculas = cambiarAMayus(listaDeCadenas, transformadorMayusculas);

        // Imprimir: resultado
        listaEnMayusculas.forEach(System.out::println);

    }
}
