package com.example.mykismat.controller;

import com.example.mykismat.dto.Facultydto;
import com.example.mykismat.model.Faculty;
import com.example.mykismat.repository.FacultyRepo;
import com.example.mykismat.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8000")
@Controller
public class FacultyController {

    @Autowired
    private FacultyService facultyService;
    Faculty fac;

    @Autowired
    private FacultyRepo facultyRepo;

    @RequestMapping(path="/login",method = RequestMethod.POST)
    public ResponseEntity<String> loginEmployee(@RequestBody Facultydto facultydto)
    {
        String msg="";
        Faculty faculty =facultyRepo.findFacultyByUsername(facultydto.getUsername());
        if(faculty!=null)
        {
            if(faculty.getPassword().equals(facultydto.getPassword())) {
                msg = "Login successful";
                return new ResponseEntity<String>(String.valueOf(faculty), HttpStatus.OK);
            }
            else
            {
                msg="Invalid password";
                return new ResponseEntity<String>(msg, HttpStatus.NOT_FOUND);
            }
        }
        else{
            msg="Username does not exists";
            return new ResponseEntity<String>(msg, HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(path="/facultyInfo/{fid}", method=RequestMethod.GET)
    public ResponseEntity<?> displayFacultyInfo(@PathVariable Integer fid)
    {
        fac = facultyService.getFacultyInfo(fid);
        return new ResponseEntity<>(String.valueOf(fac), HttpStatus.OK);
    }
}
