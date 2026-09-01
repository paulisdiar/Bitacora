package main.Semana_4.Taller4.Punto9;

public abstract class Validator {

    protected Validator next;

    public Validator setNext(
            Validator next
    ) {

        this.next = next;

        return next;
    }

    public boolean validate(String user) {

        if (!check(user)) {

            return false;
        }

        if (next != null) {

            return next.validate(user);
        }

        return true;
    }

    protected abstract boolean check(
            String user
    );
}

