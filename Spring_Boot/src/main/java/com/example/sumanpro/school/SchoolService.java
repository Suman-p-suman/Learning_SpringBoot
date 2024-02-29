package com.example.sumanpro.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository repository;
   private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository repository, SchoolMapper schoolMapper) {
        this.repository = repository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto getTheSchool(SchoolDto dto){

        var school= schoolMapper.toSchool(dto);
        var hhl=repository.save(school);
        return dto;
    }
    public List<SchoolDto> finAll(){
        return repository.findAll().stream().map(SchoolMapper::toSchoolDto).collect(Collectors.toList());
    }
}
