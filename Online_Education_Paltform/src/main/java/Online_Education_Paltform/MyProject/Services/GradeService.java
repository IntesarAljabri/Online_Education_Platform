package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Discussion;
import Online_Education_Paltform.MyProject.Models.Grade;
import Online_Education_Paltform.MyProject.Repositories.DiscussionRepositories;
import Online_Education_Paltform.MyProject.Repositories.GradeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GradeService {

    @Autowired
    GradeRepositories gradeRepositories;
    public List<Grade> getAllGrade() {

        return gradeRepositories.findAll();
    }
    public Grade getGradeById(Integer id) {

        return gradeRepositories.findById(id).get();
    }
}
