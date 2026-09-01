import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<String> correos = Arrays.asList(
                "a@correo.com",
                "b@correo.com",
                "a@correo.com",
                "c@correo.com",
                "b@correo.com"
        );

        Set<String> correosUnicos = correos.stream()
                .collect(Collectors.toSet());

        System.out.println("Correos únicos:");
        correosUnicos.forEach(System.out::println);
    }
}