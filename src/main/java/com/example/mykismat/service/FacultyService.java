package com.example.mykismat.service;

import com.example.mykismat.model.Faculty;
import com.example.mykismat.repository.FacultyRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FacultyService {
    @Autowired
    private FacultyRepo facultyRepo;

    public Faculty getFacultyInfo(Integer fid) {
        if(fid !=null) {
            return facultyRepo.findFacultyByFid(fid);
        }
        else{
            return null;
        }
    }
}
