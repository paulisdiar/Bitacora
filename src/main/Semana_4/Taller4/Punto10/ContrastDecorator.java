package main.Semana_4.Taller4.Punto10;

public class ContrastDecorator
        extends ImageDecorator {

    public ContrastDecorator(Image image) {
        super(image);
    }

    @Override
    public String render() {

        return image.render() + " + CONTRASTE";
    }
}