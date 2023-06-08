package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Models.Student;
import Online_Education_Paltform.MyProject.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "student")
public class StudentControllers {

    @Autowired
    StudentService studentservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAllStudent() {

        return studentservice.getAllStudent();
    }
    @GetMapping(value = "getById")
    public Student getStudentById(@RequestParam Integer id) {

        return studentservice.getStudentById(id);
    }
}
