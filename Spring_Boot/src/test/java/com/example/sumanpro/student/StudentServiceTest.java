package com.example.sumanpro.student;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @InjectMocks
    StudentService service;
    @Mock
    private StudentMapper mapper;
    @Mock
    private StudentRepository repository;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
}