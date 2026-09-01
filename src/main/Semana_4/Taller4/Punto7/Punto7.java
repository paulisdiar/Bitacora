package main.Semana_4.Taller4.Punto7;

public class Punto7 {

    public static void main(String[] args) {

        Document document =
                new Document(
                        "Contrato DOSW"
                );

        DocumentHandler author =
                new AuthorHandler();

        author.handle(document);

        document.approve();
    }
}