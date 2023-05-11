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
@Table(name = "Certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "certificate_id")
    Integer certificate_id;

   // @Column(name = "certificate_date")
    String certificate_date;

    @OneToOne
    Enrollment enrollment;

}
