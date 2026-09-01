package main.Semana_2.Pokemon.AltoMando;

import java.util.List;
import main.Semana_2.Pokemon.Modelo.Pokemon;


public class CampeonLiga {

    public static void main(String[] args) {

        // Creamos la Pokédex con los Pokémon y su poder.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 70, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 30, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 55, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 65, 610, "Kanto", false)
        );

        // Ordenamos de mayor a menor poder de combate
        // y nos quedamos con los primeros cinco.
        List<Pokemon> top5 = pokemones.stream()
                .sorted((p1, p2) ->
                        Double.compare(
                                p2.getPoderCombate(),
                                p1.getPoderCombate()
                        )
                )
                .limit(5)
                .toList();

        // Mostramos el ranking.
        for (int i = 0; i < top5.size(); i++) {
            Pokemon pokemon = top5.get(i);

            System.out.println(
                    "#" + (i + 1)
                            + " " + pokemon.getNombre()
                            + " – PC: "
                            + (int) pokemon.getPoderCombate()
            );
        }
    }
}