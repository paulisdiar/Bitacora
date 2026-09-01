package main.Semana_4.Taller4.Punto10;

public abstract class ImageDecorator
        implements Image {

    protected final Image image;

    protected ImageDecorator(Image image) {
        this.image = image;
    }
}
