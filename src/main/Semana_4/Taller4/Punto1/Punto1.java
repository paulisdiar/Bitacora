package main.Semana_4.Taller4.Punto1;

public class Punto1 {

    public static void main(String[] args) {

        PaymentFactory colombia =
                new ColombiaPaymentFactory();

        PaymentStrategy pse =
                colombia.create("pse");

        Checkout checkout =
                new Checkout(pse);

        checkout.pagar(150000);

        PaymentStrategy nequi =
                colombia.create("nequi");

        new Checkout(nequi).pagar(85000);


        PaymentFactory usa =
                new UsaPaymentFactory();

        PaymentStrategy paypal =
                usa.create("paypal");

        new Checkout(paypal).pagar(200);
    }
}