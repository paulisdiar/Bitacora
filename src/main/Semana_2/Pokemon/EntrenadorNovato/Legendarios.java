package main.Semana_2.Pokemon.EntrenadorNovato;

import java.util.List;

public class Legendarios {

    public static void main(String[] args) {

        // Creamos la lista de Pokémon con sus niveles
        List<PokemonNivel> pokemones = List.of(
                new PokemonNivel("Pikachu", 45),
                new PokemonNivel("Mewtwo", 88),
                new PokemonNivel("Dragonite", 82),
                new PokemonNivel("Squirtle", 38),
                new PokemonNivel("Mew", 85),
                new PokemonNivel("Charmander", 62)
        );

        // Filtramos los Pokémon con nivel superior a 80
        // y contamos cuántos cumplen la condición
        long cantidad = pokemones.stream()
                .filter(pokemon -> pokemon.nivel() > 80)
                .count();

        // Mostramos la cantidad encontrada
        System.out.println("Pokémon con nivel > 80: " + cantidad);
    }

    // Clase auxiliar para representar el Pokémon y su nivel
    record PokemonNivel(String nombre, int nivel) {
    }
}