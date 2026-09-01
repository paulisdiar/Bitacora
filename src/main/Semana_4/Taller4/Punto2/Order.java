package main.Semana_4.Taller4.Punto2;

public class Order {

    private final java.util.List<NotificationObserver> observers =
            new java.util.ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void changeStatus(String status) {

        System.out.println(
                "\nPedido cambiado a: " + status
        );

        observers.forEach(
                observer -> observer.notify(status)
        );
    }
}