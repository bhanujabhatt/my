package com.example.mykismat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="student")
public class Student {
    @Id
    @JsonProperty(value="sId")
    @Column(name="sId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sid;

    @JsonProperty(value="roll")
    @Column(name="roll")
    Integer roll;

    @JsonProperty(value="sname")
    @Column(name="sname")
    String sname;

    @JsonProperty(value="lname")
    @Column(name="lname")
    String lname;

    @JsonProperty(value="gradyear")
    @Column(name="gradyear")
    String gradyear;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    List<StudentCourse> studentCourse;
}
