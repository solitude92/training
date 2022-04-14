package com.example.springtraining.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
//        System.out.println("so we are here" + "\n\n\n\n\n" + student);

        Optional<Student> optionalStudent = studentRepository.findByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("The following email exist, please try another email.");
        } else {
            studentRepository.save(student);
        }
    }

    public void deleteStudent(Long studentId) {
        if (studentRepository.findById(studentId).isPresent())
            studentRepository.deleteById(studentId);
        else
            throw new IllegalStateException("User not found");
    }

    public void updateStudent(Student student) {

        Optional<Student> student1 = studentRepository.findById(student.getId());
        if (Objects.equals(student1.get().getNationalCode(), student.getNationalCode()) &&
                Objects.equals(student1.get().getPhoneNum(), student.getPhoneNum())
        )
            studentRepository.save(student);
    }


}
