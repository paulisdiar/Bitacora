package main.Semana_4.Taller4.Punto5;

public class LegacyBankAdapter
        implements PaymentProcessor {

    private final LegacyBankService legacy;

    public LegacyBankAdapter(
            LegacyBankService legacy
    ) {
        this.legacy = legacy;
    }

    @Override
    public void pay(double amount) {

        // El sistema moderno trabaja con pesos.
        // El sistema legacy trabaja con centavos.
        int cents = (int) (amount * 100);

        legacy.executeTransaction(
                "ACC-001",
                cents
        );
    }
}