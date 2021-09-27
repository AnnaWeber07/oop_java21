package annachiriciuc;

public class Program {

    public static boolean compareDisplays(Monitor displayOne, Monitor displayTwo) {
        if (displayOne.getDimension().dimX + displayOne.getDimension().dimY >
                displayTwo.getDimension().dimX + displayTwo.getDimension().dimY
                && displayOne.getResolution().resX + displayOne.getResolution().resY >
                displayTwo.getResolution().resX + displayTwo.getResolution().resY)
            return true;
        else return false;
    }

    public static void main(String[] args) { //i did everything (task for grade 10)
        //manipulating Monitor objects:

        Monitor displayOne = new Monitor("SAMSUNG", "Titanium Grey", 1440, 3040, 7, 15);
        Monitor displayTwo = new Monitor("IPHONE", "Sierra Blue", 1242, 2688, 8, 16);


        if (compareDisplays(displayOne, displayTwo)) {
            System.out.println(displayOne.getName() + " has better resolution and dimension than " + displayTwo.getName());
            System.out.println(displayOne.getName() + " is in color " + displayOne.getColor() + " and " + displayTwo.getName() + " is in color " + displayTwo.getColor());
        } else {
            System.out.println(displayTwo.getName() + " has better resolution and dimension than " + displayOne.getName());
            System.out.println(displayTwo.getName() + " is in color " + displayTwo.getColor() + " and " + displayOne.getName() + " is in color " + displayOne.getColor());
        }

        University UTM = new University("UTM", 1964);
        University USMF = new University("USMF", 1945);
        University ASEM = new University("ASEM", 1991);

        ASEM.addStudent(new Student("Alex", 19, 10.00));
        ASEM.addStudent(new Student("Vadim", 20, 8.04));
        ASEM.addStudent(new Student("Maxim", 21, 7.95));
        ASEM.addStudent(new Student("Sandra", 18, 9.95));
        System.out.println("ASEM average: " + ASEM.averageGrade());

        USMF.addStudent(new Student("Iulya", 25, 9.25));
        USMF.addStudent(new Student("Ahmed", 25, 9.87));
        USMF.addStudent(new Student("Artiom", 24, 9.89));
        USMF.addStudent(new Student("Vera", 26, 8.31));
        System.out.println("USMF average: " + USMF.averageGrade());

        UTM.addStudent(new Student("Jane", 21, 9.84));
        UTM.addStudent(new Student("Nikita", 22, 9.40));
        UTM.addStudent(new Student("Anna", 20, 10.00));
        UTM.addStudent(new Student("Alexandr", 24, 9.29));
        System.out.println("UTM average: " + UTM.averageGrade());
    }
}
