package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByDepartment implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Perform null checks -done
       if (s1.getDepartment() == null || s2.getDepartment() == null) {
           return 0;
       }
       else {
           return s1.getDepartment().compareTo(s2.getDepartment());
       }
    }
}
