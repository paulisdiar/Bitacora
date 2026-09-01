package main.Semana_4.Taller4.Punto2;

public class PushMessage implements Message {

    private final String text;

    public PushMessage(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("PUSH JSON: {mensaje: '" + text + "'}");
    }
}
