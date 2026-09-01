package main.Semana_4.Taller4.Punto8;

public class Punto8 {

    public static void main(String[] args) {

        Order order =
                new OrderBuilder()
                        .setSize("LARGE")
                        .setMeat("DOUBLE_BEEF")
                        .addTopping("queso")
                        .addTopping("lechuga")
                        .addSide("papas")
                        .addSide("gaseosa")
                        .build();

        order.addObserver(
                new KitchenService()
        );

        order.addObserver(
                new BillingService()
        );

        order.addObserver(
                new DeliveryService()
        );

        order.confirm();
    }
}