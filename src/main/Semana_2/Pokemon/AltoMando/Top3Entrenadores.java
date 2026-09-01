package main.Semana_2.Pokemon.AltoMando;

import main.Semana_2.Pokemon.Modelo.Entrenador;
import main.Semana_2.Pokemon.Modelo.Pokemon;
import java.util.List;

public class Top3Entrenadores {

    public static void main(String[] args) {

        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Gary", 10, List.of()),
                new Entrenador(2L, "Ash", 8, List.of()),
                new Entrenador(3L, "Dawn", 7, List.of()),
                new Entrenador(4L, "Brock", 6, List.of())
        );

        // Ordenamos siguiendo los tres criterios indicados:
        // 1. Más medallas.
        // 2. Mayor poder acumulado.
        // 3. Nombre alfabéticamente.
        List<Entrenador> top3 = entrenadores.stream()
                .sorted(
                        (e1, e2) -> {

                            int comparacionMedallas =
                                    Integer.compare(
                                            e2.getMedallas(),
                                            e1.getMedallas()
                                    );

                            if (comparacionMedallas != 0) {
                                return comparacionMedallas;
                            }

                            double poder1 = e1.getEquipo().stream()
                                    .mapToDouble(Pokemon::getPoderCombate)
                                    .sum();

                            double poder2 = e2.getEquipo().stream()
                                    .mapToDouble(Pokemon::getPoderCombate)
                                    .sum();

                            int comparacionPoder =
                                    Double.compare(poder2, poder1);

                            if (comparacionPoder != 0) {
                                return comparacionPoder;
                            }

                            return e1.getNombre()
                                    .compareTo(e2.getNombre());
                        }
                )
                .limit(3)
                .toList();

        System.out.println("Top 3 entrenadores:");

        top3.stream()
                .forEach(entrenador ->
                        System.out.println(
                                entrenador.getNombre()
                                        + " - "
                                        + entrenador.getMedallas()
                                        + " medallas"
                        )
                );
    }
}