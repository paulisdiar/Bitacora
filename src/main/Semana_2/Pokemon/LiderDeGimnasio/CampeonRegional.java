package main.Semana_2.Pokemon.LiderDeGimnasio;

import main.Semana_2.Pokemon.Modelo.Pokemon;

import java.util.List;

public class CampeonRegional {

    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 70, 530, "Kanto", false),
                new Pokemon(4L, "Charizard", "Fuego", 65, 610, "Kanto", false)
        );

        // Buscamos el Pokémon con mayor poder de combate.
        Pokemon campeon = pokemones.stream()
                .max((p1, p2) ->
                        Double.compare(
                                p1.getPoderCombate(),
                                p2.getPoderCombate()
                        )
                )
                .orElse(null);

        System.out.println(
                "Campeón: "
                        + campeon.getNombre()
                        + " con PC: "
                        + (int) campeon.getPoderCombate()
        );
    }
}