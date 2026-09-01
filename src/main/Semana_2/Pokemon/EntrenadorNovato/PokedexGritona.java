package main.Semana_2.Pokemon.EntrenadorNovato;

import java.util.List;

public class PokedexGritona {

    public static void main(String[] args) {

        // Creamos la lista con los nombres de los Pokémon
        List<String> pokemones = List.of(
                "Pikachu",
                "Charmander",
                "Squirtle",
                "Bulbasaur"
        );

        // Utilizamos map() para transformar cada nombre
        List<String> resultado = pokemones.stream()
                .map(String::toUpperCase)
                .toList();

        // Mostramos el resultado
        System.out.println("Pokémon en mayúsculas: " + resultado);
    }
}