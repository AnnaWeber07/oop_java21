package annachiriciuc;

public class Square extends Figure {
    private double _a;

    Square(double a) {
        this._a = a;
    }


    @Override
    public double getArea() { return _a*_a;

    }

    @Override
    public double getPerimeter() { return 4*_a;

    }
}