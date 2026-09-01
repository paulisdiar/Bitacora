import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio6 {

    public static void main(String[] args) {

        List<String> empleados = Arrays.asList(
                "Laura",
                "Pedro",
                "Carlos",
                "Ana"
        );

        List<String> resultado = empleados.stream()
                .map(String::toUpperCase)
                .peek(nombre -> System.out.println("Transformado: " + nombre))
                .collect(Collectors.toList());

        System.out.println("Lista: " + resultado);
    }
}