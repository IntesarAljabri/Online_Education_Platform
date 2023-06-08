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
@Table(name = "Instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructorId")
    Integer instructorId;

    @Column(name = "instructorName")
    String instructorName;

    @Column(name = "instructorMajor")
    String instructorMajor;

    @Column(name = "instructorPhone")
    Integer instructorPhone;

    @ManyToMany
    @JsonIgnore
    private List<Course> courses;
}
