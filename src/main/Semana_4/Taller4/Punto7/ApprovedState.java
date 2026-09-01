package main.Semana_4.Taller4.Punto7;

public class ApprovedState
        implements DocumentState {

    public void approve(Document document) {

        System.out.println(
                "El documento ya está aprobado."
        );
    }

    public void reject(Document document) {

        System.out.println(
                "No se puede rechazar un documento aprobado."
        );
    }
}