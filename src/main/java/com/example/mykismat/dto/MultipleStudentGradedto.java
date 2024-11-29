package com.example.mykismat.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MultipleStudentGradedto {
    private List<Integer> ids;
    private Integer cid;
    private String grade;
    private Integer points;

    public void MultipleStudGradeDto() {
    }
}
