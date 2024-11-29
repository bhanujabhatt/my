package com.example.mykismat.service;


import com.example.mykismat.dto.StudentCourseDto;
import com.example.mykismat.model.StudentCourse;
import com.example.mykismat.repository.CourseRepo;
import com.example.mykismat.repository.StudentCourseRepo;
import com.example.mykismat.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {
    @Autowired
    private StudentCourseRepo studentCourseRepo;

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;

    public StudentCourse setGradeOfStudent(Integer sid, StudentCourseDto studentCourseDto) {

        StudentCourse studentcourse = studentCourseRepo.findBySid(sid,studentCourseDto.getCid());

        studentcourse.setStudent(studentRepo.findById(sid).orElse(null));
        studentcourse.setCourse(courseRepo.findById(studentCourseDto.getCid()).orElse(null));
        studentcourse.setPoints(studentCourseDto.getPoints());
        studentcourse.setGrade(studentCourseDto.getGrade());

        return studentCourseRepo.saveAndFlush(studentcourse);

    }


}
