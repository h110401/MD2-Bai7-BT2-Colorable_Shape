package rikkei.academy;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{new Circle(), new Rectangle(), new Square()};

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getArea());
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}