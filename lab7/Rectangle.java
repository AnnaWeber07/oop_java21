package annachiriciuc;

public class Rectangle extends Figure {
    private double _a;
    private double _b;

    Rectangle(double a, double b) {
        this._a = a;
        this._b = b;
    }

    @Override
    public double getArea() {

        return _a * _b;
    }

    @Override
    public double getPerimeter() {

        return 2 * (_a + _b);
    }
}
