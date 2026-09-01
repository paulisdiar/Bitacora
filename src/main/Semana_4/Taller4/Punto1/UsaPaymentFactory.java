package main.Semana_4.Taller4.Punto1;

public class UsaPaymentFactory implements PaymentFactory {

    @Override
    public PaymentStrategy create(String type) {

        return switch (type.toLowerCase()) {
            case "paypal" -> new PaypalStrategy();
            case "tarjeta" -> new TarjetaStrategy();
            default -> throw new IllegalArgumentException(
                    "Método no disponible en USA"
            );
        };
    }
}