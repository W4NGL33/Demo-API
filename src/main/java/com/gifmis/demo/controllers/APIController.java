package com.gifmis.demo.controllers;


import com.gifmis.demo.entities.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1")
public class APIController {
    //API controller will not return the page

    @GetMapping("students")
    public ArrayList<Students> getStudents(){
    //public String getStudents(){
       // return "These are list of all the students";

        Students students = new Students();
        Students students1 = new Students();
        //students.add("Nathan");
        //students.add("Example");
        students.setUniversity("Abuja University");
        students1.setUniversity("Abuja University");
        students.setMatriculationNumber("BHU/13/04/00293");
        students.setDepartment("Information Technology");
        students.setFirstName("Frederick");
        students.setLastName("Benstowe");
        students.setDateOfBirth("21/90/1999");
        students.setLevel(200);

        students1.setMatriculationNumber("BHU/13/04/96293");
        students1.setDepartment("Legal");
        students1.setFirstName("Michael");
        students1.setLastName("Egbita");
        students1.setDateOfBirth("12/23/1990");
        students1.setLevel(100);

        ArrayList<Students> student = new ArrayList<>();
        student.add(students1);
        student.add(students);
        return student;
    }

}
