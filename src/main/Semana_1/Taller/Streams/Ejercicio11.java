import java.util.Arrays;
import java.util.List;

public class Ejercicio11 {

    public static void main(String[] args) {

        List<Integer> precios = Arrays.asList(
                12000,
                5000,
                18000,
                7500,
                3000
        );

        int precioMinimo = precios.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("Precio mínimo: " + precioMinimo);
    }
}