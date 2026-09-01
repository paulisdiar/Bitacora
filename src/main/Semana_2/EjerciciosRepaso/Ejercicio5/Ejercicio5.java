package main.Semana_2.EjerciciosRepaso.Ejercicio5;

import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos la lista de transacciones bancarias
        List<Transaction> transactions = List.of(
                new Transaction("TX-001", 120.50, true),
                new Transaction("TX-002", 350.00, true),
                new Transaction("TX-003", 90.25, false),
                new Transaction("TX-004", 500.00, true)
        );

        // Verificamos si existe alguna transacción no aprobada
        boolean hasUnapprovedTransaction = transactions.stream()

                // peek() permite observar cada transacción
                // mientras está siendo procesada
                .peek(System.out::println)

                // Buscamos una transacción que NO esté aprobada
                .anyMatch(transaction -> !transaction.isApproved());

        // El resultado indica si existe alguna transacción no aprobada
        System.out.println(
                "¿Existe una transacción no aprobada? "
                        + hasUnapprovedTransaction
        );
    }
}
