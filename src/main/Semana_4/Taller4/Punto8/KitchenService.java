package main.Semana_4.Taller4.Punto8;

public class KitchenService
        implements OrderObserver {

    public void onOrderConfirmed() {

        System.out.println(
                "Cocina: preparando pedido."
        );
    }
}