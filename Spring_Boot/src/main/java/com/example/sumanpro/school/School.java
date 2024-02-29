package com.example.sumanpro.school;

import com.example.sumanpro.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   private String name;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @OneToMany(
           mappedBy = "school",
           cascade = CascadeType.ALL    )
   private List<Student> student;
    public School(){

    }
    public School(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public School setId(Integer id) {
        this.id = id;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
