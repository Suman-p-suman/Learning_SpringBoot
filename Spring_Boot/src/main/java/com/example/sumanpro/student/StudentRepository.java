package com.example.sumanpro.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "SELECT * FROM student where firstname=?1",nativeQuery = true)
    List<Student> findByStudentName(String st);

}
