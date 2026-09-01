package main.Semana_2.Pokemon.EntrenadorNovato;

import java.util.List;

public class PoderEquipo {

    public static void main(String[] args) {

        // Creamos la lista con los niveles de los Pokémon
        List<Integer> niveles = List.of(
                45, 62, 38, 71, 55, 29
        );

        // Utilizamos reduce() para sumar todos los niveles
        int sumaTotal = niveles.stream()
                .reduce(0, (total, nivel) -> total + nivel);

        // Mostramos la suma obtenida
        System.out.println("Suma total de niveles: " + sumaTotal);
    }
}