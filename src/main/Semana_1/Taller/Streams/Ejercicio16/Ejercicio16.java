package main.Semana_1.Taller.Streams.Ejercicio16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio16 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Ana", 4.5),
                new Estudiante("Carlos", 3.2),
                new Estudiante("Pedro", 2.8),
                new Estudiante("Laura", 4.8),
                new Estudiante("Andrés", 3.9),
                new Estudiante("María", 2.5)
        );

        List<Estudiante> resultado = estudiantes.stream()

                // 1. Filtrar estudiantes aprobados
                .filter(estudiante -> estudiante.getPromedio() >= 3.0)

                // 2. Convertir los nombres a mayúsculas
                .map(estudiante ->
                        new Estudiante(
                                estudiante.getNombre().toUpperCase(),
                                estudiante.getPromedio()
                        )
                )

                // 3. Ordenar por promedio de mayor a menor
                .sorted((e1, e2) ->
                        Double.compare(e2.getPromedio(), e1.getPromedio())
                )

                // 4. Mostrar cada estudiante procesado
                .peek(estudiante ->
                        System.out.println(
                                "Procesado: "
                                        + estudiante.getNombre()
                                        + " "
                                        + estudiante.getPromedio()
                        )
                )

                // 5. Guardar en una nueva lista
                .collect(Collectors.toList());

        System.out.println("\nLista final:");
        System.out.println(resultado);
    }
}