package com.example.demo.controller;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("/hello/{}")
    public String helloWorld(){
        return "hi!!!!";
    }

    @GetMapping("/subjects")
    public List<Subject> getAllSubject(){
        return subjectService.getSubjects();
    }

    @PostMapping("/subjects")
    public void addSubject(@RequestBody Subject subject){ }

}


