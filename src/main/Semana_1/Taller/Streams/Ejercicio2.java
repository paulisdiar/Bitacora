import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> productos = Arrays.asList(
                "Laptop",
                "Mouse",
                "Teclado",
                "Monitor",
                "Impresora"
        );

        productos.stream()
                .forEach(producto ->
                        System.out.println("Producto disponible: " + producto)
                );
    }
}