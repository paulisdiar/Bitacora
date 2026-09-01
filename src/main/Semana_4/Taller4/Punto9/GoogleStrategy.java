package main.Semana_4.Taller4.Punto9;

public class GoogleStrategy implements AuthStrategy {

    public boolean authenticate(String user) {

        System.out.println(
                "Autenticando mediante Google..."
        );

        return true;
    }
}