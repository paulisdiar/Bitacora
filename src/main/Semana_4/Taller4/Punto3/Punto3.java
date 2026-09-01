package main.Semana_4.Taller4.Punto3;

public class Punto3 {

    public static void main(String[] args) {

        ReportGenerator report =
                ReportFactory.create("PDF");

        report.generate();

        System.out.println();

        report = ReportFactory.create("CSV");

        report.generate();
    }
}