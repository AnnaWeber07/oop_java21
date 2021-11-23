package annachiriciuc;

public class Triangle extends Figure {

    private double _a;
    private double _b;
    private double _c;
    private double _p;

    Triangle(double a, double b, double c) {
        this._a = a;
        this._b = b;
        this._c = c;
    }

    @Override
    public double getArea() {
        _p = (_a + _b + _c) / 2;
        return Math.sqrt((_p * (_p - _a) * (_p - _b) * (_p - _c)));
    }

    @Override
    public double getPerimeter() {
        return _a + _b + _c;
    }
}
