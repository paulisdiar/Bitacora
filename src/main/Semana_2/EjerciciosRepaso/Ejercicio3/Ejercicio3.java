package main.Semana_2.EjerciciosRepaso.Ejercicio3;

import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos algunos usuarios para realizar la prueba
        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 17, false),
                new User(3, "Miguel", 30, true),
                new User(4, "Beatriz", 28, false),
                new User(5, "Juan", 35, true)
        );

        // Procesamos los usuarios utilizando Streams
        List<String> resultado = users.stream()

                // Conservamos únicamente los usuarios activos
                .filter(User::isActive)

                // Obtenemos el nombre de cada usuario
                .map(User::getName)

                // Convertimos los nombres a mayúsculas
                .map(String::toUpperCase)

                // Ordenamos los nombres alfabéticamente
                .sorted()

                // Guardamos el resultado en una lista
                .toList();

        // Mostramos el resultado
        System.out.println("Usuarios activos: " + resultado);
    }
}