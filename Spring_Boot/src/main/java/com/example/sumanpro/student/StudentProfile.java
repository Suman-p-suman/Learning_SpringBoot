//package com.example.sumanpro;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(schema = "studentProfile")
//public class StudentProfile {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String bio;
//    @OneToOne
//    @JoinColumn(
//            name = "student_id"
//    )
//    private Student student;
//
//    public StudentProfile() {
//    }
//
//    public StudentProfile(String bio) {
//        this.bio = bio;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//}
