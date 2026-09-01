import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(
                12, 8, 5, 10, 15
        );

        int suma = numeros.stream()
                .reduce(0, (total, numero) -> total + numero);

        System.out.println("Suma total: " + suma);
    }
}