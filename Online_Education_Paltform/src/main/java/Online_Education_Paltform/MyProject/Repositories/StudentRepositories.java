package Online_Education_Paltform.MyProject.Repositories;

import Online_Education_Paltform.MyProject.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositories extends JpaRepository<Student, Integer> {}
