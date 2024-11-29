package com.example.mykismat.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class StudentCourse {

    @Id
    Long scid;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "sId")
    Student student;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cId")
    Course course;

    String grade;
    Integer points;

}
