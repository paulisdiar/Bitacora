import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio10 {

    public static void main(String[] args) {

        List<String> peliculas = Arrays.asList(
                "Avatar",
                "Titanic",
                "Interestelar",
                "Matrix",
                "Gladiador"
        );

        List<String> resultado = peliculas.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("Películas restantes: " + resultado);
    }
}