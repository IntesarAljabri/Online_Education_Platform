package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Repositories.AssignmentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepositories assignmentRepositories;
    public List<Assignment> getAllAssignment() {

        return assignmentRepositories.findAll();
    }
    public Assignment getAssignmentById(Integer id) {

        return assignmentRepositories.findById(id).get();
    }
}
