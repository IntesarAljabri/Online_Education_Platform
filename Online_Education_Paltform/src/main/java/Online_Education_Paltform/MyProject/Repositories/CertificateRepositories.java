package Online_Education_Paltform.MyProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.stereotype.Repository;

import java.security.cert.Certificate;
@Repository
public interface CertificateRepositories extends JpaRepository<Certificate, Integer> {
}
