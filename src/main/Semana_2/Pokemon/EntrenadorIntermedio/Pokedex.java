package main.Semana_2.Pokemon.EntrenadorIntermedio;

import java.util.List;

public class Pokedex {

    public static void main(String[] args) {

        // Creamos una lista de Pokémon que contiene algunos nombres repetidos.
        List<String> pokemones = List.of(
                "Pikachu",
                "Charmander",
                "Pikachu",
                "Squirtle",
                "Charmander",
                "Mewtwo"
        );

        // Creamos un Stream para procesar la lista.
        List<String> resultado = pokemones.stream()

                // distinct() elimina los elementos que aparecen repetidos.
                .distinct()

                // Convertimos nuevamente el resultado en una lista.
                .toList();

        // Mostramos la lista sin duplicados.
        System.out.println("Pokémon sin duplicados: " + resultado);
    }
}