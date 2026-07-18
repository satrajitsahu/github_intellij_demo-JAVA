package com.example.studentmanagement.Service;

import com.example.studentmanagement.Entity.Student;
import com.example.studentmanagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Add Student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Get Student By ID
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update Student
    public Student updateStudent(Long id, Student updatedStudent) {

        Student student = repository.findById(id).orElse(null);

        if (student != null) {

            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setCourse(updatedStudent.getCourse());
            student.setAge(updatedStudent.getAge());

            return repository.save(student);
        }

        return null;
    }

    // Delete Student
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}