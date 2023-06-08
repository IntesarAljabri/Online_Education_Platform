package Online_Education_Paltform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradeId")
    Integer gradeId;
    @Column(name = "gradeValue")
    Double gradeValue;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Quiz quiz;
}
