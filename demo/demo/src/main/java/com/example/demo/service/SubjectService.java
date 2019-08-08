package com.example.demo.service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject create(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }

    public Optional<Subject> getSubjectById(long id){
        return subjectRepository.findById(id);
    }

}
