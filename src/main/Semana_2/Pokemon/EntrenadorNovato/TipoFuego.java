package main.Semana_2.Pokemon.EntrenadorNovato;

import java.util.List;

public class TipoFuego {

    public static void main(String[] args) {

        // Creamos una lista con el nombre y el tipo de cada Pokémon
        List<PokemonTipo> pokemones = List.of(
                new PokemonTipo("Pikachu", "Eléctrico"),
                new PokemonTipo("Charmander", "Fuego"),
                new PokemonTipo("Squirtle", "Agua"),
                new PokemonTipo("Vulpix", "Fuego"),
                new PokemonTipo("Bulbasaur", "Planta"),
                new PokemonTipo("Flareon", "Fuego")
        );

        // Utilizamos un Stream para procesar la lista
        List<String> resultado = pokemones.stream()

                // Filtramos únicamente los Pokémon de tipo Fuego
                .filter(pokemon -> pokemon.tipo().equals("Fuego"))

                // Obtenemos solamente el nombre del Pokémon
                .map(PokemonTipo::nombre)

                // Convertimos el resultado en una lista
                .toList();

        // Mostramos los Pokémon encontrados
        System.out.println("Pokémon tipo Fuego: " + resultado);
    }

    // Clase auxiliar para representar un Pokémon con nombre y tipo
    record PokemonTipo(String nombre, String tipo) {
    }
}