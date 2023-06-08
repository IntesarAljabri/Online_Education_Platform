package Online_Education_Paltform.MyProject.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quizNumber")
    Integer quizNumber;

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "quiz")
    @JsonIgnore
    private List<Grade> grades;
}
