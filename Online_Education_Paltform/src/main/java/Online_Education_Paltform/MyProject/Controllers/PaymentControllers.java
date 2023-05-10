package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Models.Payment;
import Online_Education_Paltform.MyProject.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "payment")
public class PaymentControllers {

    //    http://localhost:8080/payment/getAll
    @Autowired
    PaymentService paymentservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment> getAllPayments() {

        return paymentservice.getAllPayments();
    }
    @GetMapping(value = "getById")
    public Payment getPaymentById(@RequestParam Integer id) {

        return paymentservice.getPaymentById(id);
    }
}
