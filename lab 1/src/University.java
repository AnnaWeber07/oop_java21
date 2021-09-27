package annachiriciuc;

import java.util.ArrayList; //for dynamic array

public class University { //initialize class University
    private String name;
    private int foundationYear;
    private ArrayList<Student> student_list = new ArrayList<Student>(0);

    public University(String name, int foundationYear) { //create constructor
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void addStudent(Student _student) { //function for adding
        student_list.add(_student);
    }

    public double averageGrade() {//
        double sum = 0.f;
        for (int i = 0; i < student_list.size(); i++)
            sum += student_list.get(i).getGrade();
        return sum / student_list.size();
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public ArrayList<Student> getStudent_list() {
        return student_list;
    }

}
