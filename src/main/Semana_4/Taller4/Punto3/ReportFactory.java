package main.Semana_4.Taller4.Punto3;

public class ReportFactory {

    public static ReportGenerator create(String type) {

        return switch (type.toUpperCase()) {

            case "PDF" -> new PdfReport();

            case "EXCEL" -> new ExcelReport();

            case "CSV" -> new CsvReport();

            default -> throw new IllegalArgumentException(
                    "Tipo de reporte no válido"
            );
        };
    }
}