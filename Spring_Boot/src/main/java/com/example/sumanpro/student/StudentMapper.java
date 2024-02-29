package com.example.sumanpro.student;

import com.example.sumanpro.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
   public StudentResponeDto tostt(StudentDto msg) {
        return new StudentResponeDto(msg.firsname(), msg.lastname(), msg.email());
    }
    public StudentResponeDto to_student(Student student){
        return new StudentResponeDto(student.getFirstname(),student.getLastname(),student.getEmail());
    }
    public Student tomatch(StudentDto studentDto){
        Student student=new Student();
        student.setFirstname(studentDto.firsname());
        student.setLastname(studentDto.lastname());
        student.setEmail(studentDto.email());
        School school=new School();
        school.setId(studentDto.schoolId());
        student.setSchool(school);
        return student;
    }
}
