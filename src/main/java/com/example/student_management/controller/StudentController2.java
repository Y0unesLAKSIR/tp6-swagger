package com.example.student_management.controller;

import com.example.student_management.entity.Student;
import com.example.student_management.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController2 {

    @Autowired
    private StudentService studentService;

    @Operation(summary = "Récupérer tous les étudiants")
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
}
