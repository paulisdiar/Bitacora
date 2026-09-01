package main.Semana_4.Taller4.Punto7;

public class DraftState
        implements DocumentState {

    public void approve(Document document) {

        System.out.println(
                "Documento pasa a revisión."
        );

        document.setState(
                new InReviewState()
        );
    }

    public void reject(Document document) {

        document.setState(
                new RejectedState()
        );
    }
}
