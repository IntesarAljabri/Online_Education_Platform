package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Repositories.AssignmentRepositories;
import Online_Education_Paltform.MyProject.Repositories.CertificateRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.stereotype.Service;

import java.security.cert.Certificate;
import java.util.List;
@Service
public class CertificateService {

    @Autowired
    CertificateRepositories certificateRepositories;
    public List<Certificate> getAllCertificate() {

        return certificateRepositories.findAll();
    }
    public Certificate getCertificateById(Integer id) {

        return certificateRepositories.findById(id).get();
    }
}
