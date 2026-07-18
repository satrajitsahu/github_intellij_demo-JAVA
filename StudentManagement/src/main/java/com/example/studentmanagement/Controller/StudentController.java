package com.example.studentmanagement.Controller;

import com.example.studentmanagement.Entity.Student;
import com.example.studentmanagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;
    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }
    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
    // Get Student By ID
    @GetMapping("/id/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }
    // Update Student
    @PutMapping("/id/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }
    @GetMapping("/test")
    public String test(){
        return "Controller is working";
    }
    // Delete Student
    @DeleteMapping("/id/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully!";
    }
}