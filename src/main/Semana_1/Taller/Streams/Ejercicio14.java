import java.util.Arrays;
import java.util.List;

public class Ejercicio14 {

    public static void main(String[] args) {

        List<Double> notas = Arrays.asList(
                4.0,
                3.5,
                4.2,
                5.0,
                3.8
        );

        boolean todasAprobadas = notas.stream()
                .allMatch(nota -> nota >= 3.0);

        System.out.println("¿Todas >= 3.0? " + todasAprobadas);
    }
}