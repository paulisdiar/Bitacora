package main.Semana_4.Taller4.Punto1;

public class PseStrategy implements PaymentStrategy {

    @Override
    public void process(double amount) {
        System.out.println("Pago de $" + amount + " realizado mediante PSE.");
    }
}
