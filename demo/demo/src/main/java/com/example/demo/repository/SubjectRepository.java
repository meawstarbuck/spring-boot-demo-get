package com.example.demo.repository;

import com.example.demo.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    List<Subject> findAll();
}
