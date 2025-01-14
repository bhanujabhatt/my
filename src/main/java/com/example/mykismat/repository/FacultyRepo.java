package com.example.mykismat.repository;

import com.example.mykismat.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Integer> {

    Faculty findFacultyByFid(Integer fid);

    Faculty findFacultyByUsername(String username);

}
