package main.Semana_4.Taller4.Punto9;

public class AuthService {

    private AuthStrategy strategy;

    public AuthService(
            AuthStrategy strategy
    ) {
        this.strategy = strategy;
    }

    public void authenticate(
            String user,
            Validator validator
    ) {

        if (!strategy.authenticate(user)) {

            System.out.println(
                    "Autenticación fallida."
            );

            return;
        }

        System.out.println(
                "Autenticación exitosa."
        );

        if (validator.validate(user)) {

            System.out.println(
                    "Acceso concedido."
            );

        } else {

            System.out.println(
                    "Acceso denegado."
            );
        }
    }
}