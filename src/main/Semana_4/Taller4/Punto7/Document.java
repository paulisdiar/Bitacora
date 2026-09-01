package main.Semana_4.Taller4.Punto7;

public class Document {

    private DocumentState state =
            new DraftState();

    private final String name;

    public Document(String name) {
        this.name = name;
    }

    public void setState(
            DocumentState state
    ) {
        this.state = state;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public String getName() {
        return name;
    }
}
