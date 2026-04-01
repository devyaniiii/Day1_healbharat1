package com.example.healbharat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.healbharat.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}