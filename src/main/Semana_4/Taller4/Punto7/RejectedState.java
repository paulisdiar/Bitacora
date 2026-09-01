package main.Semana_4.Taller4.Punto7;

public class RejectedState
        implements DocumentState {

    public void approve(Document document) {

        System.out.println(
                "El documento fue rechazado."
        );
    }

    public void reject(Document document) {

        System.out.println(
                "El documento ya está rechazado."
        );
    }
}