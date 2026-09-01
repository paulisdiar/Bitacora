import java.util.Arrays;
import java.util.List;

public class Ejercicio12 {

    public static void main(String[] args) {

        List<Integer> salarios = Arrays.asList(
                1800000,
                2500000,
                3200000,
                2100000,
                4000000
        );

        int salarioMaximo = salarios.stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("Salario máximo: " + salarioMaximo);
    }
}