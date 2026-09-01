package main.Semana_2.Pokemon.EntrenadorIntermedio;

import java.util.List;

public class EvolucionesPreparadas {

    public static void main(String[] args) {

        // Creamos una lista con los Pokémon y su estado de evolución.
        List<PokemonEvolucion> pokemones = List.of(
                new PokemonEvolucion("Pikachu", true),
                new PokemonEvolucion("Raichu", false),
                new PokemonEvolucion("Charmander", true),
                new PokemonEvolucion("Charizard", false),
                new PokemonEvolucion("Squirtle", true),
                new PokemonEvolucion("Blastoise", false)
        );

        // Procesamos los Pokémon utilizando Streams.
        List<String> resultado = pokemones.stream()

                // Filtramos únicamente los que pueden evolucionar.
                .filter(PokemonEvolucion::puedeEvolucionar)

                // Obtenemos solamente sus nombres.
                .map(PokemonEvolucion::nombre)

                // Guardamos los nombres en una nueva lista.
                .toList();

        // Mostramos los Pokémon listos para evolucionar.
        System.out.println("Listos para evolucionar: " + resultado);
    }

    // Clase auxiliar que representa un Pokémon y
    // si actualmente puede evolucionar.
    record PokemonEvolucion(
            String nombre,
            boolean puedeEvolucionar
    ) {
    }
}