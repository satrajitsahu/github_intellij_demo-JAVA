package learn.Runner;

import learn.corejava.Student;
import learn.second.Teacher;

public class StartApplication {
    static void main(String[] args) {
        Teacher teacher=new Teacher(12345,"Programming","Java");
        teacher.show();

        Student student=new Student(100,"Ram","Spring-Boot");
        student.display();
    }
}
