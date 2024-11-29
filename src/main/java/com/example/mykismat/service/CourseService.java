package com.example.mykismat.service;

import com.example.mykismat.dto.StudentListCoursedto;
import com.example.mykismat.model.Course;
import com.example.mykismat.model.StudentCourse;
import com.example.mykismat.repository.CourseRepo;
import com.example.mykismat.repository.StudentCourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private StudentCourseRepo studentCourseRepo;

    public List<Course> getFacultyCourse(Integer fid) {
        return courseRepo.findAllByCurrentFac(fid);

    }
    public List<StudentListCoursedto> getCourseStudents(Integer cid) {

        List<StudentCourse> studlist = studentCourseRepo.findAllStudentOfCourse(cid);
        List<StudentListCoursedto> slist = new ArrayList<StudentListCoursedto>();
        for (StudentCourse stud : studlist)
        {
            StudentListCoursedto sone = new StudentListCoursedto();
            sone.setStudent(stud.getStudent());
            sone.setCourse(stud.getCourse());
            sone.setCid(stud.getScid());
            sone.setPoints(stud.getPoints());
            sone.setGrade(stud.getGrade());
            slist.add(sone);
        }
        return slist;
    }
}
