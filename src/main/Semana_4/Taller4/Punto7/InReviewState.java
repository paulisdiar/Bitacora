package main.Semana_4.Taller4.Punto7;

public class InReviewState
        implements DocumentState {

    public void approve(Document document) {

        System.out.println(
                "Documento aprobado."
        );

        document.setState(
                new ApprovedState()
        );
    }

    public void reject(Document document) {

        System.out.println(
                "Documento rechazado."
        );

        document.setState(
                new RejectedState()
        );
    }
}