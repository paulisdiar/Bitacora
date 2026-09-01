package main.Semana_4.Taller4.Punto2;

public class SmsMessageFactory implements MessageFactory {

    public Message build(String event) {
        return new SmsMessage(
                "Pedido actualizado: " + event
        );
    }
}