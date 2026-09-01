package main.Semana_4.Taller4.Punto10;

public class Punto10 {

    public static void main(String[] args) {

        Image image =
                new BaseImage();

        System.out.println(
                image.render()
        );


        ApplyFilterCommand sepia =
                new ApplyFilterCommand(
                        image,
                        SepiaDecorator::new
                );

        sepia.execute();

        image = sepia.getImage();

        System.out.println(
                image.render()
        );


        ApplyFilterCommand brightness =
                new ApplyFilterCommand(
                        image,
                        BrightnessDecorator::new
                );

        brightness.execute();

        image = brightness.getImage();

        System.out.println(
                image.render()
        );


        ApplyFilterCommand contrast =
                new ApplyFilterCommand(
                        image,
                        ContrastDecorator::new
                );

        contrast.execute();

        image = contrast.getImage();

        System.out.println(
                image.render()
        );


        // Deshacer el último filtro.
        contrast.undo();

        image = contrast.getImage();

        System.out.println(
                "Después de UNDO: "
                        + image.render()
        );
    }
}