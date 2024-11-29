package com.example.mykismat.repository;

import com.example.mykismat.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    @Query("select c FROM Course c where c.faculty.fid = :cfid")
    List<Course> findAllByCurrentFac(@Param("cfid") Integer cfid);

}
