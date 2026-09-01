package main.Semana_4.Taller4.Punto1;

public class Checkout {

    private final PaymentStrategy strategy;

    public Checkout(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pagar(double amount) {
        strategy.process(amount);
    }
}