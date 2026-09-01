package main.Semana_2.Pokemon.AltoMando;


import main.Semana_2.Pokemon.Modelo.Entrenador;

import java.util.List;

public class EntrenadorExperimentado {

    public static void main(String[] args) {

        // Creamos la lista de entrenadores.
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, List.of()),
                new Entrenador(2L, "Misty", 5, List.of()),
                new Entrenador(3L, "Brock", 6, List.of()),
                new Entrenador(4L, "Gary", 10, List.of()),
                new Entrenador(5L, "May", 3, List.of()),
                new Entrenador(6L, "Dawn", 7, List.of())
        );

        // Filtramos los entrenadores con más de 5 medallas.
        List<Entrenador> experimentados = entrenadores.stream()
                .filter(entrenador -> entrenador.getMedallas() > 5)
                .toList();

        System.out.println(
                "Entrenadores con > 5 medallas:"
        );
        System.out.println(experimentados);
    }
}