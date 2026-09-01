import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> ciudades = Arrays.asList(
                "Bogotá",
                "Medellín",
                "Cali",
                "Barranquilla"
        );

        List<String> resultado = ciudades.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Ciudades en mayúsculas: " + resultado);
    }
}