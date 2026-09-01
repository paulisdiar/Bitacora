package main.Semana_2.Pokemon.AltoMando;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import main.Semana_2.Pokemon.Modelo.Pokemon;
public class PokedexAnalitica {

    public static void main(String[] args) {

        // Lista completa de Pokémon.
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 90, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 70, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 30, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 55, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 65, 610, "Kanto", false)
        );

        // Agrupamos los Pokémon por tipo y contamos
        // cuántos hay en cada grupo.
        Map<String, Long> porTipo = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.counting()
                ));

        // Agrupamos los Pokémon por región y contamos
        // cuántos pertenecen a cada región.
        Map<String, Long> porRegion = pokemones.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getRegion,
                        Collectors.counting()
                ));

        // Contamos cuántos Pokémon son legendarios.
        long legendarios = pokemones.stream()
                .filter(Pokemon::isLegendario)
                .count();

        // Calculamos el promedio de nivel.
        double promedioNivel = pokemones.stream()
                .mapToInt(Pokemon::getNivel)
                .average()
                .orElse(0.0);

        // Buscamos el Pokémon con mayor poder de combate.
        Pokemon masFuerte = pokemones.stream()
                .max((p1, p2) ->
                        Double.compare(
                                p1.getPoderCombate(),
                                p2.getPoderCombate()
                        )
                )
                .orElse(null);

        // Mostramos los resultados.
        System.out.println("Por tipo: " + porTipo);
        System.out.println("Por región: " + porRegion);
        System.out.println("Legendarios: " + legendarios);
        System.out.printf(
                "Promedio niv: %.2f%n",
                promedioNivel
        );
        System.out.println(
                "Más fuerte: "
                        + masFuerte.getNombre()
                        + " (PC: "
                        + (int) masFuerte.getPoderCombate()
                        + ")"
        );
    }
}