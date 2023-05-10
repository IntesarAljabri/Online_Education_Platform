package Online_Education_Paltform.MyProject.Controllers;

import Online_Education_Paltform.MyProject.Models.Course;
import Online_Education_Paltform.MyProject.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "course")
public class CourseControllers {

    //    http://localhost:8080/course/getAll
    @Autowired
    CourseService courseservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Course> getAllCourses() {

        return courseservice.getAllCourses();
    }
    @GetMapping(value = "getById")
    public Course getCourseById(@RequestParam Integer id) {

        return courseservice.getCourseById(id);
    }
}
