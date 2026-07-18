package learn.second;

import learn.corejava.Student;

public class Teacher {
    int uid;
    String dept;
    String specialization;

    //Tightly coupled java class(Student & Teacher)
    Student obj;

    public Teacher(int uid, String dept, String specialization) {
        this.uid = uid;
        this.dept = dept;
        this.specialization = specialization;

        //object injection
        obj=new Student(110,"Sham","php");
    }
    public void show(){
        System.out.println("Uid :"+uid);
        System.out.println("Dept :"+dept);
        System.out.println("Specialization :"+specialization);
    }
}
