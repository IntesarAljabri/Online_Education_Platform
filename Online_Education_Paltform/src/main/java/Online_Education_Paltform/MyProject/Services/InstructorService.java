package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Grade;
import Online_Education_Paltform.MyProject.Models.Instructor;
import Online_Education_Paltform.MyProject.Repositories.GradeRepositories;
import Online_Education_Paltform.MyProject.Repositories.InstructorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstructorService {
    @Autowired
    InstructorRepositories instructorRepositories;
    public List<Instructor> getAllInstructor() {

        return instructorRepositories.findAll();
    }
    public Instructor getInstructorById(Integer id) {

        return instructorRepositories.findById(id).get();
    }
}
