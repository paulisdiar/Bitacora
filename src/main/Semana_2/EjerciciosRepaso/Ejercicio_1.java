import java.util.List;

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Creamos la lista de números que vamos a procesar
        List<Integer> numbers = List.of(3, 8, 10, 12, 15, 18, 20);

        // Creamos un Stream para recorrer los números
        // filter() permite conservar únicamente los elementos
        // que cumplen la condición indicada
        List<Integer> resultado = numbers.stream()
                .filter(n -> n % 2 == 0)   // Verifica que el número sea par
                .filter(n -> n > 10)       // Verifica que sea mayor a 10
                .toList();                 // Convierte el resultado nuevamente en una lista

        // Mostramos la lista resultante
        System.out.println("Números pares mayores a 10: " + resultado);
    }
}