package main.Semana_4.Taller4.Punto9;

public class Punto9 {

    public static void main(String[] args) {

        AuthStrategy strategy =
                new GoogleStrategy();

        Validator credentials =
                new CredentialValidator();

        credentials
                .setNext(
                        new PermissionValidator()
                )
                .setNext(
                        new LocationValidator()
                )
                .setNext(
                        new TimeValidator()
                );

        AuthService service =
                new AuthService(strategy);

        service.authenticate(
                "paula",
                credentials
        );
    }
}