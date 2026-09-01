package main.Semana_4.Taller4.Punto2;

public class SmsNotifier implements NotificationObserver {

    private final MessageFactory factory =
            new SmsMessageFactory();

    @Override
    public void notify(String event) {
        factory.build(event).send();
    }
}