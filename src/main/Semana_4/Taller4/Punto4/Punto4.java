package main.Semana_4.Taller4.Punto4;

public class Punto4 {

    public static void main(String[] args) {

        // Builder construye el personaje.
        Character warrior =
                new WarriorBuilder()
                        .setArmor("steel")
                        .setWeapon("sword")
                        .setSkill("rage")
                        .build();

        // Decorator agrega poderes dinámicamente.
        Character powered =
                new ShieldDecorator(
                        new SpeedDecorator(warrior)
                );

        powered.attack();
    }
}