package main.Semana_4.Taller4.Punto1;

public interface PaymentFactory {
    PaymentStrategy create(String type);
}