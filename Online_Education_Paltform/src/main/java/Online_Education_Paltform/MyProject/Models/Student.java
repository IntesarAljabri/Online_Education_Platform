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
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    Integer studentId;

    @Column(name = "studentName")
    String studentName;

    @Column(name = "studentAge")
    Integer studentAge;

    @OneToMany(mappedBy = "student")
    @JsonIgnore
    private List<Enrollment> enrollments;
}
