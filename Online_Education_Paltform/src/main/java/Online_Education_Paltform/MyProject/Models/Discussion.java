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
    @Column(name = "discussionId")
    Integer discussionId;

    @Column(name = "discussionDate")
    String discussionDate;

    @Column(name = "discussionTopic")
    String discussionDopic;

    @ManyToOne
    private Course course;
}
