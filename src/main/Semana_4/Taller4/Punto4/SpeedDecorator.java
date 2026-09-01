package main.Semana_4.Taller4.Punto4;

public class SpeedDecorator
        extends CharacterDecorator {

    public SpeedDecorator(Character character) {
        super(character);
    }

    @Override
    public void attack() {

        System.out.println("Velocidad extra activada.");

        character.attack();
    }
}