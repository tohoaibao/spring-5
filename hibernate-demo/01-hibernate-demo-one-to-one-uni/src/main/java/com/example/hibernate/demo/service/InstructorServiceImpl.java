package com.example.hibernate.demo.service;

import com.example.hibernate.demo.entity.Instructor;
import com.example.hibernate.demo.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public void deleteInstructor(int instructorId) {
        instructorRepository.deleteById(instructorId);
    }

}
