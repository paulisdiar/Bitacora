package main.Semana_2.Pokemon.LiderDeGimnasio;

import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrdenPorTipo {

    public static void main(String[] args) {

        // Creamos los Pokémon indicando su tipo.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Squirtle", "Agua", 30, 210, "Kanto", false),
                new Pokemon(2L, "Psyduck", "Agua", 35, 250, "Kanto", false),
                new Pokemon(3L, "Charmander", "Fuego", 25, 180, "Kanto", false),
                new Pokemon(4L, "Vulpix", "Fuego", 28, 190, "Kanto", false),
                new Pokemon(5L, "Bulbasaur", "Planta", 30, 200, "Kanto", false)
        );

        // Agrupamos los Pokémon utilizando su tipo.
        Map<String, List<Pokemon>> porTipo = pokemones.stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo));

        // Mostramos cada grupo.
        porTipo.forEach((tipo, lista) ->
                System.out.println(
                        tipo + ": "
                                + lista.stream()
                                .map(Pokemon::getNombre)
                                .toList()
                )
        );
    }
}