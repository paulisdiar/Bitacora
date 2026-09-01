package main.Semana_2.Pokemon.EntrenadorIntermedio;

import java.util.List;

public class Profesor {

    public static void main(String[] args) {

        // Creamos la lista de nombres de Pokémon.
        List<String> pokemones = List.of(
                "Squirtle",
                "Pikachu",
                "Mewtwo",
                "Bulbasaur",
                "Charmander",
                "Abra"
        );

        // Procesamos la lista utilizando Streams.
        List<String> resultado = pokemones.stream()

                // sorted() ordena los nombres alfabéticamente.
                .sorted()

                // Convertimos el resultado en una lista.
                .toList();

        // Mostramos la Pokédex organizada.
        System.out.println("Pokédex ordenada: " + resultado);
    }
}