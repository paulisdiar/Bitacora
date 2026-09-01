package main.Semana_4.Taller4.Punto3;

public abstract class ReportGenerator {

    // Template Method.
    // El orden de los pasos no cambia.
    public final void generate() {

        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    private void fetchData() {
        System.out.println("1. Obteniendo datos...");
    }

    private void processData() {
        System.out.println("2. Procesando información...");
    }
    protected abstract void applyFormat();

    protected abstract void exportFile();
}

