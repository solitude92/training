package com.example.springtraining.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController( StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> info(Student student) {
        return studentService.getStudent();
    }

    @PostMapping
    public void saveInfo(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping(path ="{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }
    @PutMapping(path = "update")
    public void updateInfo(@RequestBody Student student){
        studentService.updateStudent(student);
    }

}
