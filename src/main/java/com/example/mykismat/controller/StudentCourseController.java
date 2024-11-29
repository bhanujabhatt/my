package com.example.mykismat.controller;

import com.example.mykismat.dto.MultipleStudentGradedto;
import com.example.mykismat.dto.StudentCourseDto;
import com.example.mykismat.model.StudentCourse;
import com.example.mykismat.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/update")
@Controller
public class StudentCourseController {
    @Autowired
    private StudentCourseService studentCourseService;

    @RequestMapping(path="/{sid}", method= RequestMethod.PUT)
    public StudentCourse updateGradeOfStudent(@PathVariable Integer sid, @RequestBody StudentCourseDto studentCourseDto)
    {
        StudentCourse stud = studentCourseService.setGradeOfStudent(sid,studentCourseDto);
        return ResponseEntity.ok(stud).getBody();
    }

    @RequestMapping(path="/grade", method= RequestMethod.PUT)
    public String updateGradesOfStudents(@RequestBody MultipleStudentGradedto studentgradeDto)
    {
        StudentCourseDto studentCourseDto = new StudentCourseDto();
        studentCourseDto.setGrade(studentgradeDto.getGrade());
        studentCourseDto.setCid(studentgradeDto.getCid());
        studentCourseDto.setPoints(studentgradeDto.getPoints());

        List<Integer> sids = studentgradeDto.getIds();
        for (Integer sid : sids){
            studentCourseService.setGradeOfStudent(sid,studentCourseDto);
        }
        //StudentCourse stud = studentCourseService.setGradeOfStudent(studentCourseDto);
        return ResponseEntity.ok("Updated").getBody();
    }
}
