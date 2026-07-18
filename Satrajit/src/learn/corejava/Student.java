package learn.corejava;

import learn.second.Teacher;

public class Student {
    int roll;
    String name;
    String course;

    Teacher obj;
    
    public Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        obj=new Teacher(12345,"Programming","Java");
    }
    public void display(){
        System.out.println("Roll :"+roll);
        System.out.println("Name :"+name);
        System.out.println("Course :"+course);
    }
}