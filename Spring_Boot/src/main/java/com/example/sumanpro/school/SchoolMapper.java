package com.example.sumanpro.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    School toSchool(SchoolDto schoolDto){
        School school=new School(schoolDto.name());
        return school;
    }
    static SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getName());
    }
}
