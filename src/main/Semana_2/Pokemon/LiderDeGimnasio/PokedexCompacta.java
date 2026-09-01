package main.Semana_2.Pokemon.LiderDeGimnasio;


import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;

public class PokedexCompacta {

    public static void main(String[] args) {

        // Creamos la lista completa de Pokémon.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 70, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 30, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 55, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 65, 610, "Kanto", false)
        );

        // Transformamos cada objeto Pokemon en solamente su nombre.
        List<String> nombres = pokemones.stream()
                .map(Pokemon::getNombre)
                .toList();

        System.out.println("Pokédex compacta:");
        System.out.println(nombres);
    }
}