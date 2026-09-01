package main.Semana_4.Taller4.Punto2;

public class SmsMessage implements Message {

    private final String text;

    public SmsMessage(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("SMS: " + text);
    }
}
