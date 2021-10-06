package annachiriciuc;

public class Box {
    public int height;
    public int width;
    public int depth;


    public Box() {//first ctor w default value 1
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(int value) {//second ctor w same value
        height = width = depth = value;
    }

    public Box(int _height, int _width, int _depth) {//third ctor w parameters
        height = _height;
        width = _width;
        depth = _depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void Volume() {
        int volume = this.depth * this.width * this.height;
        System.out.println("The volume of the box is equal to " + volume);
    }

    public void SurfaceArea() {
        int area = 2 * (this.height * this.width + this.height * this.depth + this.width * this.depth);
        System.out.println("The surface area of the box is equal to " + area);
    }
}