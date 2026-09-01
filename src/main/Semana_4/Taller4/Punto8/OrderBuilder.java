package main.Semana_4.Taller4.Punto8;

public class OrderBuilder {

    private String size;
    private String meat;

    private final java.util.List<String> toppings =
            new java.util.ArrayList<>();

    private final java.util.List<String> sides =
            new java.util.ArrayList<>();

    public OrderBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public OrderBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public OrderBuilder addSide(String side) {
        sides.add(side);
        return this;
    }

    public Order build() {

        if (size == null || meat == null) {
            throw new IllegalStateException(
                    "El pedido debe tener tamaño y carne."
            );
        }

        return new Order(
                size,
                meat,
                toppings,
                sides
        );
    }
}
