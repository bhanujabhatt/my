package com.example.mykismat.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="faculty")

public class Faculty {
    @Getter
    @Id
    @JsonProperty(value="fId")
    @Column(name="fId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int fid;

    @Getter
    @JsonProperty(value="fname")
    @Column(name="fname")
    String fname;

    @Getter
    @JsonProperty(value="lname")
    @Column(name="lname")
    String lname;

    @JsonProperty(value="email")
    @Column(name="email")
    String email;

    @JsonProperty(value="title")
    @Column(name="title")
    String title;

    @JsonProperty(value="department")
    @Column(name="department")
    String dept;

    @JsonProperty(value="username")
    @Column(name="username")
    String username;

    @JsonProperty(value="password")
    @Column(name="password")
    String password;

    public Faculty() {
    }

    @Override
    public String toString() {
        return "{" +
                "\"fid\":" + fid +
                ", \"fname\":'" + fname + '\'' +
                ", \"lname\":'" + lname + '\'' +
                ", \"email\":'" + email + '\'' +
                ", \"title\":'" + title + '\'' +
                ", \"dept\":'" + dept + '\'' +
                '}';
    }

    @OneToMany(mappedBy="faculty")
    private List<Course> course;
}
