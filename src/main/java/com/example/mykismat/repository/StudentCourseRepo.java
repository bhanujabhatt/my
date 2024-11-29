package com.example.mykismat.repository;

import com.example.mykismat.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentCourseRepo extends JpaRepository<StudentCourse, Integer> {
    @Query("select sc FROM StudentCourse sc where sc.student.sid=:sid and sc.course.cid=:cid")
    StudentCourse findBySid(@Param("sid") Integer sid, @Param("cid") Integer cid);

    @Query("select sc FROM StudentCourse sc where sc.course.cid = :cid")
    List<StudentCourse> findAllStudentOfCourse(@Param("cid") Integer cid);

}
