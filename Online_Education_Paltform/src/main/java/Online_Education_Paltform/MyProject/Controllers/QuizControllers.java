package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Models.Quiz;
import Online_Education_Paltform.MyProject.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "quiz")
public class QuizControllers {

    //    http://localhost:8080/quiz/getAll
    @Autowired
    QuizService quizservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Quiz> getAllQuizzes() {

        return quizservice.getAllQuizzes();
    }
    @GetMapping(value = "getById")
    public Quiz getQuizById(@RequestParam Integer id) {

        return quizservice.getQuizById(id);
    }
}
