package Online_Education_Paltform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Data
@Entity
public class Enrollment {
    @Id
    private Long id;

    @ManyToOne
    Student student;

    @ManyToOne
    Course course;

    String enrollmentDate;
}
