package main.Semana_4.Taller4.Punto5;

public class LegacyBankService {

    public void connect() {
        System.out.println("Conectando con banco antiguo...");
    }

    public void authenticate() {
        System.out.println("Autenticando...");
    }

    public void executeTransaction(
            String account,
            int cents
    ) {
        System.out.println(
                "Transacción ejecutada para "
                        + account
                        + " por "
                        + cents
                        + " centavos."
        );
    }
}