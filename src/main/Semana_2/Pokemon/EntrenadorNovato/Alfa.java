package main.Semana_2.Pokemon.EntrenadorNovato;

import java.util.List;

public class Alfa {

    public static void main(String[] args) {

        // Creamos la lista de Pokémon con sus respectivos niveles
        List<PokemonNivel> pokemones = List.of(
                new PokemonNivel("Pikachu", 45),
                new PokemonNivel("Charmander", 62),
                new PokemonNivel("Squirtle", 38),
                new PokemonNivel("Snorlax", 90),
                new PokemonNivel("Mewtwo", 88)
        );

        // Buscamos el Pokémon con el nivel más alto
        PokemonNivel pokemonAlfa = pokemones.stream()
                .max((p1, p2) -> Integer.compare(p1.nivel(), p2.nivel()))
                .orElse(null);

        // Mostramos el resultado
        System.out.println(
                "Pokémon Alfa: "
                        + pokemonAlfa.nombre()
                        + " (nivel "
                        + pokemonAlfa.nivel()
                        + ")"
        );
    }

    // Clase auxiliar para representar el Pokémon y su nivel
    record PokemonNivel(String nombre, int nivel) {
    }
}