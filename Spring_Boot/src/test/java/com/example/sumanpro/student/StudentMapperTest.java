package com.example.sumanpro.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    StudentMapper mapper;
    @BeforeEach
    void setUp() {
        //System.out.println("edu before test methode");
        mapper=new StudentMapper();
    }
    @Test
    void testStudentdto(){
        StudentDto studentDto=new StudentDto("suman","suman","suman@gmail.com",2);
        Student student=mapper.tomatch(studentDto);
        Assertions.assertEquals(student.getFirstname(),studentDto.firsname());
        Assertions.assertEquals(student.getLastname(),studentDto.lastname());
        Assertions.assertEquals(student.getEmail(),studentDto.email());
        assertNotNull(student.getSchool());
        Assertions.assertEquals(student.getSchool().getId(),studentDto.schoolId());


    }
    @Test
    void Test_when_we_pass_null(){
        Assertions.assertThrows(NullPointerException.class,()->mapper.tomatch(null));
    }
    @Test
    void testStudent(){
    Student student=new Student("suman","lastnan","ab@gmail.com",22);
    StudentResponeDto studentResponeDto=mapper.to_student(student);
    Assertions.assertEquals(student.getFirstname(),studentResponeDto.firsname());
    Assertions.assertEquals(student.getLastname(),studentResponeDto.lastname());
    Assertions.assertEquals(student.getEmail(),studentResponeDto.email());

    }



}