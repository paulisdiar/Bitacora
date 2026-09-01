import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio7 {

    public static void main(String[] args) {

        List<Integer> edades = Arrays.asList(
                25, 18, 32, 21, 19, 28
        );

        List<Integer> ascendente = edades.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> descendente = edades.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Ascendente: " + ascendente);
        System.out.println("Descendente: " + descendente);
    }
}