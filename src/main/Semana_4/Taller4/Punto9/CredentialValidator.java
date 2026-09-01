package main.Semana_4.Taller4.Punto9;

public class CredentialValidator
        extends Validator {

    protected boolean check(String user) {

        System.out.println(
                "Validando credenciales..."
        );

        return true;
    }
}