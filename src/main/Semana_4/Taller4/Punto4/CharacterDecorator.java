package main.Semana_4.Taller4.Punto4;

public abstract class CharacterDecorator
        implements Character {

    protected final Character character;

    protected CharacterDecorator(Character character) {
        this.character = character;
    }
}
