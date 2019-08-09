package com.example.demo.controller;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/subjects/{id}")
    public Optional<Subject>getSubjectById(@PathVariable long id){return subjectService.getSubjectById(id);}

    //Get data to Json and push data to Object
    @PostMapping("/subjects/create")
    public  Subject create(@RequestBody Subject subject){return subjectService.create(subject);}

//    @GetMapping("/subjects/{subject}/{username}")
//    	public Subject getSubjectByUsername(@PathVariable String subject, @PathVariable String user_name) {
//    		return subjectService.getSubjectByUsername(subject, user_name);
//    	}


}


