package annachiriciuc;


import java.util.ArrayList;
import java.util.Arrays;

public class FigureController {


    public Figure getBiggestArea(ArrayList<Figure> figures) {
        Figure result = figures.get(0);

        for (int i = 1; i < figures.size(); i++) {
            if (figures.get(i).getArea() > result.getArea())
                result = figures.get(i);
        }
        return result;
    }

    public Figure getBiggestPerimeter(ArrayList<Figure> figures) {
        Figure result = figures.get(0);

        for (int i = 1; i < figures.size(); i++) {
            if (figures.get(i).getPerimeter() > result.getPerimeter())
                result = figures.get(i);
        }
        return result;
    }

}
