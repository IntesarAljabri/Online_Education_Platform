package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "assignment")
public class AssignmentControllers {
    //    http://localhost:8080/assignment/getAll
    @Autowired
    AssignmentService assignmentservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Assignment> getAllAssignments() {

        return assignmentservice.getAllAssignment();
    }
    @GetMapping(value = "getById")
    public Assignment getAssignmentById(@RequestParam Integer id) {

        return assignmentservice.getAssignmentById(id);
    }
}
