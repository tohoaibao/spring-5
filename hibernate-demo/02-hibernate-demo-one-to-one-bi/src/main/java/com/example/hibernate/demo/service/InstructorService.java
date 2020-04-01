package com.example.hibernate.demo.service;

import com.example.hibernate.demo.entity.Instructor;

import java.util.List;

public interface InstructorService {

    public List<Instructor> getInstructors();

    public void deleteInstructor(int instructorId);

    public Instructor getInstructorById(int instructorId);
}
