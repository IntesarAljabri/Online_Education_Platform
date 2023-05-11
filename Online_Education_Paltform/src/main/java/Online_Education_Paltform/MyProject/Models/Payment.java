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
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    Integer payment_id;

    @Column(name = "payment_amount")
    Double payment_amount;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
    private String paymentDate;
}
