import java.util.Arrays;
import java.util.List;

public class Ejercicio13 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(
                7,
                11,
                13,
                20,
                25
        );

        boolean hayPar = numeros.stream()
                .anyMatch(numero -> numero % 2 == 0);

        System.out.println("¿Hay algún par? " + hayPar);
    }
}