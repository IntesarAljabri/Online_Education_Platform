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
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courseId")
    Integer courseId;

    //@Column(name = "courseName")
    String courseName;

//    @OneToMany(mappedBy = "course")
//    @JsonIgnore
//    List<Enrollments> enrollments;

    @ManyToMany//(mappedBy = "courses")
    //@JsonIgnore
    private List<Instructor> instructors;

    @OneToMany//(mappedBy = "course")
   // @JsonIgnore
     List<Assignment> assignments;

    @OneToMany//(mappedBy = "course")
    //@JsonIgnore
     List<Quiz> quizzes;

    @OneToMany//(mappedBy = "course")
   // @JsonIgnore
     List<Discussion> discussions;
}
