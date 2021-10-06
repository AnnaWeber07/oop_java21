package annachiriciuc;

import java.util.ArrayList;

public class Queue {
    private boolean staticSize; //check if it is fixed or not
    private int value;
    private int maxSize;
    private int currentIndex = 0;
    private int deleteIndex = 1;

    private ArrayList<Box> box_list = new ArrayList<Box>();

    public Queue() {
        staticSize = false;
        this.box_list = new ArrayList<>();
    }

    public Queue(int maxSize) {
        staticSize = true;
        this.maxSize = maxSize;
        this.box_list = new ArrayList<>(maxSize);
    }

    public void push(Box box) {
        if (this.staticSize || this.currentIndex <= this.maxSize) {
            this.box_list.add(currentIndex, box);
            this.currentIndex++;
        } else if (!staticSize) {
            this.box_list.add(currentIndex, box);
        } else {
            System.out.println("Element couldn't be added: array is full!");
        }
    }


    public void fullCheck() {
        if (staticSize) {
            int a = maxSize - this.box_list.size();
            System.out.println("The number of free elements in Queue is equal to " + a);
        } else {
            System.out.println("This Queue has no ending");
        }
    }


    public void pop() {
        if (this.currentIndex == 0 || this.deleteIndex > this.currentIndex) {
            System.out.println("The Queue is empty, the element can't be deleted");
        } else {
            this.box_list.remove(deleteIndex);
            this.deleteIndex++;
        }
    }

    public void print() {
        System.out.println(this.box_list);
    }


}
