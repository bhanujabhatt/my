package com.example.mykismat.controller;

import com.example.mykismat.dto.StudentListCoursedto;
import com.example.mykismat.model.Course;
import com.example.mykismat.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8000")
@RequestMapping("/course")
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping(path="/getcourses/{fid}", method= RequestMethod.GET)
    public List<Course> displayCoursesOfFaculty(@PathVariable Integer fid)
    {
        List<com.example.mykismat.model.Course> courseList = courseService.getFacultyCourse(fid);
        return ResponseEntity.ok(courseList).getBody();
    }

    @RequestMapping(path="/getstudents/{cid}", method=RequestMethod.GET)
    public List<StudentListCoursedto> displayStudentsOfCourse(@PathVariable Integer cid)
    {
        List<StudentListCoursedto> studcourseList = courseService.getCourseStudents(cid);
        return ResponseEntity.ok(studcourseList).getBody();
    }
}
