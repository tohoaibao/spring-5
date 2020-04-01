package com.example.hibernate.demo.service;

import com.example.hibernate.demo.entity.InstructorDetail;
import com.example.hibernate.demo.repository.InstructorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService {

    @Autowired
    private InstructorDetailRepository instructorDetailRepository;

    @Override
    public List<InstructorDetail> findAll() {
        return instructorDetailRepository.findAll();
    }
}
