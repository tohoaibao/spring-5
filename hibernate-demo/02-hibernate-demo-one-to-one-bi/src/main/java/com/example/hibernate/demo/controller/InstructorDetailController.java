package com.example.hibernate.demo.controller;

import com.example.hibernate.demo.entity.InstructorDetail;
import com.example.hibernate.demo.service.InstructorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorDetailController {

    @Autowired
    private InstructorDetailService instructorDetailService;

    @GetMapping("/instructorDetails")
    public List<InstructorDetail> getAllInstructorDetail() {

        return instructorDetailService.findAll();
    }
}
