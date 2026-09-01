package main.Semana_4.Taller4.Punto8;

public class Order {

    private final String size;
    private final String meat;
    private final java.util.List<String> toppings;
    private final java.util.List<String> sides;

    private final java.util.List<OrderObserver> observers =
            new java.util.ArrayList<>();

    public Order(
            String size,
            String meat,
            java.util.List<String> toppings,
            java.util.List<String> sides
    ) {
        this.size = size;
        this.meat = meat;
        this.toppings =
                java.util.List.copyOf(toppings);
        this.sides =
                java.util.List.copyOf(sides);
    }

    public void addObserver(
            OrderObserver observer
    ) {
        observers.add(observer);
    }

    public void confirm() {

        System.out.println(
                "Pedido confirmado: "
                        + size
                        + ", "
                        + meat
        );

        observers.forEach(
                OrderObserver::onOrderConfirmed
        );
    }
}
