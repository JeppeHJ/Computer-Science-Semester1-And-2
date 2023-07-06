package Opgaver.Opgave3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 10, 20);
        Rectangle rectangle = new Rectangle("Rectangle", 15, 25);
        Ellipse ellipse = new Ellipse("Ellipse", 5, 10);

        CompositeFigure compositeFigure = new CompositeFigure("Composite Figure");
        compositeFigure.addFigure(triangle);
        compositeFigure.addFigure(rectangle);
        compositeFigure.addFigure(ellipse);

        compositeFigure.draw();
        System.out.println("Total area: " + compositeFigure.getArea());
    }
}
