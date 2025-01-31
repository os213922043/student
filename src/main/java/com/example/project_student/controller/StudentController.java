package com.example.project_student.controller;

import com.example.project_student.entity.Student;
import com.example.project_student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//adsas
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Barcha o'quvchilarni olish
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // ID bo'yicha o'quvchini olish
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // Yangi o'quvchini ro'yxatdan o'tkazish
    @PostMapping
    public Student registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }

    // O'quvchini ID bo'yicha o'chirish
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        //sasd
        studentService.deleteStudent(id);
    }
}
