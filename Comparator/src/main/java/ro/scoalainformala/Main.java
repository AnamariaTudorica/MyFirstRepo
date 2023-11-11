package ro.scoalainformala;

import ro.scoalainformala.model.Student;
import ro.scoalainformala.model.comparators.StudentComparatorByDepartment;
import ro.scoalainformala.model.comparators.StudentComparatorByAge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Mary", "CS",25));
        students.add(new Student("John", "Law", 30));
        students.add(new Student("Jimmy", "Arts",19));

        System.out.println("Sorted ascending by age:");
        students.sort(new StudentComparatorByAge());

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Sorted descending by age:");
        students.sort(new StudentComparatorByAge().reversed());

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Sorted by Department:");
        students.sort(new StudentComparatorByDepartment());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}