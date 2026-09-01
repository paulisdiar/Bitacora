package main.Semana_2.Pokemon.LiderDeGimnasio;

import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;

public class EquipoElite {

    public static void main(String[] args) {

        // Creamos la lista de Pokémon con su poder de combate.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 70, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 30, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 55, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 65, 610, "Kanto", false)
        );

        // Filtramos los Pokémon con poder de combate superior a 500.
        List<Pokemon> equipoElite = pokemones.stream()
                .filter(pokemon -> pokemon.getPoderCombate() > 500)
                .toList();

        System.out.println("Equipo Élite (PC > 500):");
        System.out.println(equipoElite);
    }
}