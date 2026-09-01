package main.Semana_4.Taller4.Punto7;

public class AuthorHandler
        extends DocumentHandler {

    protected boolean canHandle(
            Document document
    ) {
        return true;
    }

    protected void process(
            Document document
    ) {

        System.out.println(
                "Autor revisó el documento."
        );

        document.approve();
    }
}