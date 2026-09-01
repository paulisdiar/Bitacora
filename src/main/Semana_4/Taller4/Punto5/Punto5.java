package main.Semana_4.Taller4.Punto5;

public class Punto5 {

    public static void main(String[] args) {

        BankFacade facade =
                new BankFacade();

        facade.procesarPago(150000);
    }
}