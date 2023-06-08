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
@Table(name = "Assignment")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "assignmentId")
    Integer assignmentId;

   @Column(name = "assignmentName")
    String assignmentName;

    @ManyToOne
     Course course;

    @OneToMany//(mappedBy = "assignment")
    //@JsonIgnore
   List<Grade> grades;
}
