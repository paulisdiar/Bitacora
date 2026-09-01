package main.Semana_2.Pokemon.AltoMando;

import main.Semana_2.Pokemon.Modelo.Entrenador;
import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;

public class EquipoMasPoderoso {

    public static void main(String[] args) {

        // Pokémon de Ash
        List<Pokemon> equipoAsh = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 50, 400, "Kanto", false),
                new Pokemon(2L, "Charizard", "Fuego", 70, 700, "Kanto", false),
                new Pokemon(3L, "Blastoise", "Agua", 65, 750, "Kanto", false)
        );

        // Pokémon de Gary
        List<Pokemon> equipoGary = List.of(
                new Pokemon(4L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(5L, "Dragonite", "Dragón", 75, 530, "Kanto", false),
                new Pokemon(6L, "Arcanine", "Fuego", 70, 600, "Kanto", false),
                new Pokemon(7L, "Gengar", "Fantasma", 60, 530, "Kanto", false)
        );

        // Pokémon de Brock
        List<Pokemon> equipoBrock = List.of(
                new Pokemon(8L, "Onix", "Roca", 55, 500, "Kanto", false),
                new Pokemon(9L, "Geodude", "Roca", 40, 400, "Kanto", false),
                new Pokemon(10L, "Steelix", "Acero", 65, 770, "Johto", false)
        );

        // Creamos los entrenadores con sus respectivos equipos.
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, equipoAsh),
                new Entrenador(2L, "Gary", 10, equipoGary),
                new Entrenador(3L, "Brock", 6, equipoBrock)
        );

        // Buscamos el entrenador cuyo equipo tenga
        // el mayor poder de combate acumulado.
        Entrenador masPoderoso = entrenadores.stream()
                .max((e1, e2) -> Double.compare(
                        e1.getEquipo().stream()
                                .mapToDouble(Pokemon::getPoderCombate)
                                .sum(),

                        e2.getEquipo().stream()
                                .mapToDouble(Pokemon::getPoderCombate)
                                .sum()
                ))
                .orElse(null);

        // Calculamos el poder total del entrenador ganador.
        double poderTotal = masPoderoso.getEquipo().stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .sum();

        System.out.println(
                "Entrenador más poderoso: "
                        + masPoderoso.getNombre()
        );

        System.out.println(
                "Poder acumulado del equipo: "
                        + (int) poderTotal
        );
    }
}