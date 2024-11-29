package com.example.mykismat.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Facultydto {
    private Integer fid;
    private String fname;
    private String lname;
    private String email;
    private String title;
    private String department;
    private String username;
    private String password;
}
