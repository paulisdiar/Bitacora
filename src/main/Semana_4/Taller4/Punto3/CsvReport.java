package main.Semana_4.Taller4.Punto3;

public class CsvReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("3. Aplicando formato CSV...");
    }

    @Override
    protected void exportFile() {
        System.out.println("4. Exportando archivo CSV.");
    }
}
