package com.example.hibernate.demo.repository;

import com.example.hibernate.demo.entity.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorDetailRepository extends JpaRepository<InstructorDetail, Integer> {

}
