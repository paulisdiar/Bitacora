package main.Semana_4.Taller4.Punto2;

public class EmailMessageFactory implements MessageFactory {

    public Message build(String event) {
        return new EmailMessage(
                "<html>Pedido actualizado: " + event + "</html>"
        );
    }
}
