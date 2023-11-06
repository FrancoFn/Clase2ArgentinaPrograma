/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2ArgentinaPrograma;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Franco Scaramuzzino
 */
public interface Interface {
       public static List<String> cambiarAMayus(List<String> lista, Function<String, String> cambiarMayus) {
       List<String> resultado = new ArrayList<>();
    for (String cadena : lista) {
      resultado.add(cambiarMayus.apply(cadena));
    }
    return resultado;
  }
}
