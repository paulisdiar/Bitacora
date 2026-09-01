package main.Semana_4.Taller4.Punto8;

public class DeliveryService
        implements OrderObserver {

    public void onOrderConfirmed() {

        System.out.println(
                "Domicilio: preparando ruta."
        );
    }
}