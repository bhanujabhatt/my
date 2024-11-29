package com.example.mykismat.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StudentCourseDto {
    private Integer cid;
    private String grade;
    private Integer points;

    public StudentCourseDto() {
    }
}
