package main.Semana_4.Taller4.Punto1;

public class ColombiaPaymentFactory implements PaymentFactory {

    @Override
    public PaymentStrategy create(String type) {

        return switch (type.toLowerCase()) {
            case "pse" -> new PseStrategy();
            case "nequi" -> new NequiStrategy();
            case "tarjeta" -> new TarjetaStrategy();
            default -> throw new IllegalArgumentException(
                    "Método no disponible en Colombia"
            );
        };
    }
}