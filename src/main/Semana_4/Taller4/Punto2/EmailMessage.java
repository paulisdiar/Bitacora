package main.Semana_4.Taller4.Punto2;

public class EmailMessage implements Message {

    private final String text;

    public EmailMessage(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("EMAIL: " + text);
    }
}
