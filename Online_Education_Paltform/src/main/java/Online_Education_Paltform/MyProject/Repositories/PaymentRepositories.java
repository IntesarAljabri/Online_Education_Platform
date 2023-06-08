package Online_Education_Paltform.MyProject.Repositories;

import Online_Education_Paltform.MyProject.Models.Instructor;
import Online_Education_Paltform.MyProject.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepositories extends JpaRepository<Payment, Integer> {
}
