import java.util.Arrays;
import java.util.List;

public class Ejercicio15 {

    public static void main(String[] args) {

        List<String> usuarios = Arrays.asList(
                "juan",
                "maria",
                "admin",
                "pedro",
                "soporte"
        );

        boolean ningunoEsRoot = usuarios.stream()
                .noneMatch(usuario -> usuario.equals("root"));

        System.out.println("¿Ninguno es \"root\"? " + ningunoEsRoot);
    }
}