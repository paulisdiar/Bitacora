import java.util.List;

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Creamos la lista de palabras
        List<String> words = List.of(
                "java",
                "stream",
                "api",
                "functional",
                "code",
                "git"
        );

        // Procesamos las palabras utilizando Streams
        long cantidad = words.stream()
                // Dejamos únicamente las palabras con más de 4 caracteres
                .filter(w -> w.length() > 4)

                // Convertimos cada palabra a mayúsculas
                .map(String::toUpperCase)

                // Ordenamos las palabras alfabéticamente
                .sorted()

                // Contamos cuántas palabras cumplen las condiciones
                .count();

        // Mostramos la cantidad obtenida
        System.out.println("Cantidad de palabras resultantes: " + cantidad);
    }
}