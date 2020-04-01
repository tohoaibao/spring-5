package com.example.hibernate.demo.controller;

import com.example.hibernate.demo.entity.Instructor;
import com.example.hibernate.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructors")
    public List<Instructor> getAllInstructor() {

        List<Instructor> instructors = instructorService.getInstructors();

        return instructors;
    }

    @DeleteMapping("/instructors/{instructorId}")
    public String deleteInstructor(@PathVariable int instructorId) {

        instructorService.deleteInstructor(instructorId);

        return "Delete instructor id - " + instructorId;
    }

}
