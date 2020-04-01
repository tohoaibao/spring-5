package com.example.hibernate.demo.repository;

import com.example.hibernate.demo.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
