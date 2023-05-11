package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Instructor;
import Online_Education_Paltform.MyProject.Models.Payment;
import Online_Education_Paltform.MyProject.Repositories.InstructorRepositories;
import Online_Education_Paltform.MyProject.Repositories.PaymentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentService {

    @Autowired
    PaymentRepositories paymentRepositories;
    public List<Payment> getAllPayment() {

        return paymentRepositories.findAll();
    }
    public Payment getPaymentById(Integer id) {

        return paymentRepositories.findById(id).get();
    }
}
