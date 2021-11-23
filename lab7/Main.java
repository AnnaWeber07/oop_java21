package annachiriciuc;

import java.util.ArrayList;

public class Main {

    static class Circle extends Figure {
        private double _radius;

        Circle(double radius) {
            _radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * _radius * _radius;
        }

        @Override
        public double getPerimeter() {
            return Math.PI * (_radius + _radius);
        }
    }

    public static void Main(String args[]) {

        ArrayList<Figure> figures = new ArrayList<Figure>();

        Triangle triangle1 = new Triangle(15, 25, 10);
        Square square1 = new Square(30);
        Rectangle rectangle1 = new Rectangle(10, 15);

        figures.add(triangle1);
        figures.add(square1);
        figures.add(rectangle1);

        FigureController figureController = new FigureController();
        System.out.println(figureController.getBiggestArea(figures));
        System.out.println(figureController.getBiggestPerimeter(figures));

        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        figures.add(circle);
        figureController.getBiggestArea(figures);

    }
}
