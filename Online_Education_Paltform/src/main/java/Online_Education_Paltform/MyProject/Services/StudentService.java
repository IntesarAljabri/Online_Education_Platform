package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Quiz;
import Online_Education_Paltform.MyProject.Models.Student;
import Online_Education_Paltform.MyProject.Repositories.QuizRepositories;
import Online_Education_Paltform.MyProject.Repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepositories studentRepositories;
    public List<Student> getAllStudent() {

        return studentRepositories.findAll();
    }
    public Student getStudentById(Integer id) {

        return studentRepositories.findById(id).get();
    }
}
