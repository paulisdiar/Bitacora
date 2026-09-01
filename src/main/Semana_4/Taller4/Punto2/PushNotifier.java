package main.Semana_4.Taller4.Punto2;

public class PushNotifier implements NotificationObserver {

    private final MessageFactory factory =
            new PushMessageFactory();

    @Override
    public void notify(String event) {
        factory.build(event).send();
    }
}