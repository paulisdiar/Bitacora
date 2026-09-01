package main.Semana_4.Taller4.Punto4;

public class ShieldDecorator
        extends CharacterDecorator {

    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public void attack() {

        System.out.println("Escudo de hielo activado.");

        character.attack();
    }
}