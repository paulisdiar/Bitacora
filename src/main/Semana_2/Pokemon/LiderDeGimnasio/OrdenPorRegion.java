package main.Semana_2.Pokemon.LiderDeGimnasio;

import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrdenPorRegion {

    public static void main(String[] args) {

        // Creamos la lista de Pokémon indicando su región.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Chikorita", "Planta", 30, 200, "Johto", false),
                new Pokemon(3L, "Torchic", "Fuego", 32, 220, "Hoenn", false),
                new Pokemon(4L, "Piplup", "Agua", 31, 210, "Sinnoh", false),
                new Pokemon(5L, "Charmander", "Fuego", 35, 250, "Kanto", false),
                new Pokemon(6L, "Totodile", "Agua", 33, 230, "Johto", false)
        );

        // Agrupamos los Pokémon según su región.
        Map<String, List<Pokemon>> porRegion = pokemones.stream()
                .collect(Collectors.groupingBy(Pokemon::getRegion));

        // Mostramos los nombres agrupados por región.
        porRegion.forEach((region, lista) ->
                System.out.println(
                        region + ": "
                                + lista.stream()
                                .map(Pokemon::getNombre)
                                .toList()
                )
        );
    }
}