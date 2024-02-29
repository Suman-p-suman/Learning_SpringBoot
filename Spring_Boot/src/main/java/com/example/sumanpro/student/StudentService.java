package com.example.sumanpro.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository repository, StudentMapper studentMapper) {
        this.repository = repository;
        this.studentMapper = studentMapper;
    }

    public StudentResponeDto post( StudentDto msg){
        var student=studentMapper.tomatch(msg);
        var stude= repository.save(student);
        return studentMapper.tostt(msg);
    }

    public List<StudentResponeDto> findAllStudent(){
        return repository.findAll().stream().map(studentMapper::to_student).collect(Collectors.toList());
    }


    public StudentResponeDto findbysid(Integer id){
        return repository.findById(id).map(studentMapper::to_student).orElse(null);

    }


    public List<StudentResponeDto> findbyname( String  name){
        return repository.findByStudentName(name).stream().map(studentMapper::to_student).collect(Collectors.toList());

    }


    public void delete(Integer id){
        repository.deleteById(id);
    }
}

