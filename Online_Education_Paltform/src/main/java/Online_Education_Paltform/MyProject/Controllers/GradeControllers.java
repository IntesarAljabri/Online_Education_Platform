package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Models.Grade;
import Online_Education_Paltform.MyProject.Services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "grade")
public class GradeControllers {

    @Autowired
    GradeService gradeservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Grade> getAllGrades() {

        return gradeservice.getAllGrades();
    }
    @GetMapping(value = "getById")
    public Grade getGradeById(@RequestParam Integer id) {

        return gradeservice.getGradeById(id);
    }
}
