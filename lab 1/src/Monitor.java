package annachiriciuc;

public class Monitor {
    private String name;
    private String color;

    public static class Resolution { //Resolution width and height parameters
        int resX, resY;
    }

    public static class Dimension {//Dimension width and height parameters
        int dimX, dimY;
    }

    private Resolution resolution = new Resolution();
    private Dimension dimension = new Dimension();


    public Monitor(String name, String color, int resolutionX, int resolutionY,
                   int dimensionX, int dimensionY) { //ctor
        this.name = name;
        this.color = color;
        resolution.resX = resolutionY;
        resolution.resY = resolutionY;
        dimension.dimX = dimensionX;
        dimension.dimY = dimensionY;
    }

    public void setName(String name) { //Setter for name

        this.name = name;
    }

    public void setColor(String color) { //Setter for color

        this.color = color;
    }

    public void setDimension(int dimX, int dimY) { //Setter for dimensions
        this.dimension.dimX = dimension.dimX;
        this.dimension.dimY = dimension.dimY;
    }

    public void setResolution(int resX, int resY) { //Setter for resolution
        this.resolution.resX = resolution.resX;
        this.resolution.resY = resolution.resY;
    }

    public String getName() { //Getter
        return name;
    }

    public Dimension getDimension() { //Getter
        return dimension;
    }

    public Resolution getResolution() { //Getter
        return resolution;
    }

    public String getColor() { //Getter
        return color;
    }

}
