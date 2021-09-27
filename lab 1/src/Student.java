package annachiriciuc;

public class Student { //initialize class Student
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) { //ctor
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) //setter
    {
        this.name = name;
    }

    public String getName() { //getter
        return name;
    }

    public void setAge(int age) { //setter
        this.age = age;
    }

    public int getAge() { //getter
        return age;
    }

    public void setGrade(int grade) { //setter
        this.grade = grade;
    }

    public double getGrade() { //getter
        return grade;
    }
}
