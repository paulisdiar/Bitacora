package main.Semana_4.Taller4.Punto4;

public class Warrior implements Character {

    private final String armor;
    private final String weapon;
    private final String skill;

    public Warrior(
            String armor,
            String weapon,
            String skill
    ) {
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    @Override
    public void attack() {

        System.out.println(
                "Guerrero ataca con "
                        + weapon
                        + " usando "
                        + skill
                        + " y armadura "
                        + armor
        );
    }
}
