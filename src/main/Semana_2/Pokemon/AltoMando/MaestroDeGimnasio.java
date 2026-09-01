package main.Semana_2.Pokemon.AltoMando;

import main.Semana_2.Pokemon.Modelo.Entrenador;

import java.util.List;

public class MaestroDeGimnasio {

    public static void main(String[] args) {

        // Creamos la lista de entrenadores.
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, List.of()),
                new Entrenador(2L, "Misty", 5, List.of()),
                new Entrenador(3L, "Brock", 6, List.of()),
                new Entrenador(4L, "Gary", 10, List.of())
        );

        // Buscamos el entrenador con mayor cantidad de medallas.
        Entrenador campeon = entrenadores.stream()
                .max((e1, e2) ->
                        Integer.compare(
                                e1.getMedallas(),
                                e2.getMedallas()
                        )
                )
                .orElse(null);

        System.out.println(
                "Campeón de gimnasios: "
                        + campeon.getNombre()
        );

        System.out.println(
                "Medallas obtenidas: "
                        + campeon.getMedallas()
        );
    }
}