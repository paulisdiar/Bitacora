package main.Semana_4.Taller4.Punto5;

public class BankFacade {

    private final LegacyBankService legacy;
    private final PaymentProcessor adapter;

    public BankFacade() {

        legacy = new LegacyBankService();

        adapter = new LegacyBankAdapter(
                legacy
        );
    }

    public void procesarPago(double monto) {

        // La Facade oculta los detalles.
        legacy.connect();
        legacy.authenticate();

        System.out.println(
                "Inicializando contexto bancario..."
        );

        adapter.pay(monto);
    }
}