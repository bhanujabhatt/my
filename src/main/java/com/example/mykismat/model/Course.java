package com.example.mykismat.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;



@Getter
@Setter
@Entity
@Table(name="course")
public class Course {

    @Id
    @JsonProperty(value="cId")
    @Column(name="cId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cid;

    @JsonProperty(value="cname")
    @Column(name="cname")
    String cname;

    @JsonProperty(value="ccode")
    @Column(name="ccode")
    String ccode;


    @JsonProperty(value="description")
    @Column(name="description")
    String description;

    @JsonProperty(value="year")
    @Column(name="year")
    String year;

    @JsonProperty(value="term")
    @Column(name="term")
    String term;

    @JsonProperty(value="credits")
    @Column(name="credits")
    Long credits;

    @JsonProperty(value="capacity")
    @Column(name="capacity")
    Long capacity;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name="cfid")
    Faculty faculty;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    Set<StudentCourse> studentCourse;
}
