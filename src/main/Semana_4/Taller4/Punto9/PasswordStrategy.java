package main.Semana_4.Taller4.Punto9;

public class PasswordStrategy
        implements AuthStrategy {

    public boolean authenticate(String user) {

        System.out.println(
                "Autenticando mediante usuario/contraseña..."
        );

        return true;
    }
}