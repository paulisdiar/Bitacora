package main.Semana_2.EjerciciosRepaso.Ejercicio4;

import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos la lista de usuarios
        List<User> users = List.of(
                new User(1, "Carlos", 17, true),
                new User(2, "Ana", 30, false),
                new User(3, "Miguel", 15, true),
                new User(4, "Beatriz", 28, false),
                new User(5, "Juan", 35, true)
        );

        // Filtramos las personas mayores de edad
        // y obtenemos únicamente sus nombres
        List<String> resultado = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        // Mostramos los nombres encontrados
        System.out.println("Personas mayores de edad: " + resultado);
    }
}