package Online_Education_Paltform.MyProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.Assignment;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepositories extends JpaRepository<Assignment, Integer> {
}
