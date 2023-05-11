package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Payment;
import Online_Education_Paltform.MyProject.Models.Quiz;
import Online_Education_Paltform.MyProject.Repositories.PaymentRepositories;
import Online_Education_Paltform.MyProject.Repositories.QuizRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizService {

    @Autowired
    QuizRepositories quizRepositories;
    public List<Quiz> getAllQuiz() {

        return quizRepositories.findAll();
    }
    public Quiz getQuizById(Integer id) {

        return quizRepositories.findById(id).get();
    }
}
