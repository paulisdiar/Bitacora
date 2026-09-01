package main.Semana_4.Taller4.Punto10;

public class ApplyFilterCommand implements ImageCommand {

    private Image image;

    private final java.util.function.Function<Image, Image>
            decorator;

    private Image previous;

    public ApplyFilterCommand(
            Image image,
            java.util.function.Function<Image, Image>
                    decorator
    ) {

        this.image = image;
        this.decorator = decorator;
    }

    @Override
    public void execute() {

        previous = image;

        image = decorator.apply(image);
    }

    @Override
    public void undo() {

        image = previous;
    }

    @Override
    public Image getImage() {

        return image;
    }
}
