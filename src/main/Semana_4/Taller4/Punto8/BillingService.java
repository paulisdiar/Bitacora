package main.Semana_4.Taller4.Punto8;

public class BillingService
        implements OrderObserver {

    public void onOrderConfirmed() {

        System.out.println(
                "Facturación: generando cuenta."
        );
    }
}