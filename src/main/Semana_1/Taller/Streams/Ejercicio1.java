import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList(
                "Ana",
                "Carlos",
                "Andres",
                "Pedro",
                "Alejandra",
                "Juan",
                "Amanda"
        );

        List<String> resultado = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Nombres que empiezan por A: " + resultado);
    }
}