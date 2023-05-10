package Online_Education_Paltform.MyProject.Controllers;

import Online_Education_Paltform.MyProject.Models.Instructor;
import Online_Education_Paltform.MyProject.Services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "grade")

public class InstructorControllers {

    @Autowired
    InstructorService instructor_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Instructor> getAllInstructors() {

        return instructor_service.getAllInstructors();
    }
    @GetMapping(value = "getById")
    public Instructor getInstructorById(@RequestParam Integer id) {

        return instructorservice.getInstructorById(id);
    }
}
