package main.Semana_4.Taller4.Punto7;

public abstract class DocumentHandler {

    private DocumentHandler next;

    public DocumentHandler setNext(
            DocumentHandler next
    ) {

        this.next = next;
        return next;
    }

    public void handle(Document document) {

        if (canHandle(document)) {

            process(document);

        } else if (next != null) {

            next.handle(document);

        } else {

            System.out.println(
                    "No existe un responsable para el documento."
            );
        }
    }

    protected abstract boolean canHandle(
            Document document
    );

    protected abstract void process(
            Document document
    );
}
