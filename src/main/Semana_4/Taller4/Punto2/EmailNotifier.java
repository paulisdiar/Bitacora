package main.Semana_4.Taller4.Punto2;

public class EmailNotifier implements NotificationObserver {

    private final MessageFactory factory =
            new EmailMessageFactory();

    @Override
    public void notify(String event) {
        factory.build(event).send();
    }
}
