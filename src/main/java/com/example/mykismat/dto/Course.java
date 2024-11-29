package com.example.mykismat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private Integer cId;

    public Course(Integer cId, String code, String cname, String description, String year, Integer term, String credits, Integer capacity) {
        this.cId = cId;
        this.code = code;
        this.cname = cname;
        this.description = description;
        this.year = year;
        this.term = term;
        this.credits = credits;
        this.capacity = capacity;
    }

    private String code;

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", code='" + code + '\'' +
                ", cname='" + cname + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", term=" + term +
                ", credits='" + credits + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    private String cname;
    private String description;
    private String year;
    private Integer term;
    private String credits;
    private Integer capacity;
}
