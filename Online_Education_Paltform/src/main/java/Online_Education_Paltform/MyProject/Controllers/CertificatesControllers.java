package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Services.AssignmentService;
import Online_Education_Paltform.MyProject.Services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.web.bind.annotation.*;

import java.security.cert.Certificate;
import java.util.List;
@RestController
@RequestMapping(value = "certificates")
public class CertificatesControllers {

    @Autowired
    CertificateService certificateservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Certificate> getAllCertificate() {

        return certificateservice.getAllCertificate();
    }
    @GetMapping(value = "getById")
    public Certificate getCertificateById(@RequestParam Integer id) {

        return certificateservice.getCertificateById(id);
    }
}
