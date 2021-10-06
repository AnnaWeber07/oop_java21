package annachiriciuc;

public class Program {
    public static void main(String args[]){//main
    Box box1 = new Box();
    Box box2 = new Box(2);
    Box box3 = new Box(15, 5, 25);

        System.out.println("B1 has depth "+box1.getDepth()+" height "+ box1.getHeight()+" and width "+box1.getWidth());
        System.out.println("B2 has depth "+box2.getDepth()+" height "+ box2.getHeight()+" and width "+box2.getWidth());
        System.out.println("B3 has depth "+box3.getDepth()+" height "+ box3.getHeight()+" and width "+box3.getWidth());
        System.out.println("--------------------------------------------------------------------------");
        box1.Volume();
        box2.Volume();
        box3.Volume();
        System.out.println("--------------------------------------------------------------------------");
        box1.SurfaceArea();
        box2.SurfaceArea();
        box3.SurfaceArea();
        System.out.println("------------------------------2 task& 3 task ---------------------------------------");
        Queue q1 = new Queue();
        Queue q2 = new Queue(5);
        q2.push(box1); //add element
        q2.push(box2);
        q2.push(box3);
        q2.fullCheck(); // check if we have free elements
        q1.push(new Box());
        q1.push(new Box());
        q1.push(new Box());
        q1.fullCheck(); //will print that this Queue doesn't have ending


    }
}
