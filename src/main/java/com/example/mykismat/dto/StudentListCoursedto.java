package com.example.mykismat.dto;


import com.example.mykismat.model.Course;
import com.example.mykismat.model.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentListCoursedto {
    private Long cid;
    private String grade;
    private Integer points;
    private Student student;
    private Course course;
    public void setCourse(com.example.mykismat.model.Course course) {
        this.course = course;
    }


}

