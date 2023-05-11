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
@Table(name = "Discussion")
public class Discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discussion_id")
    Integer discussion_id;

    @Column(name = "discussion_date")
    String discussion_date;

    @Column(name = "discussion_topic")
    String discussion_topic;

    @ManyToOne
    private Course course;
}
