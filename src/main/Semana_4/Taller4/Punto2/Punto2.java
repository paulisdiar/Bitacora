package main.Semana_4.Taller4.Punto2;

 public class Punto2 {

    public static void main(String[] args) {

        Order order = new Order();

        order.addObserver(new EmailNotifier());
        order.addObserver(new SmsNotifier());
        order.addObserver(new PushNotifier());

        order.changeStatus("ENVIADO");
    }
}