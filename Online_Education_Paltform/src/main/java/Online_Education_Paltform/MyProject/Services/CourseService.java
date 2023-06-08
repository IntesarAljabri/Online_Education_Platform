package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Course;
import Online_Education_Paltform.MyProject.Repositories.CertificateRepositories;
import Online_Education_Paltform.MyProject.Repositories.CourseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.cert.Certificate;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepositories courseRepositories;
    public List<Course> getAllCourse() {

        return courseRepositories.findAll();
    }
    public Course getCourseById(Integer id) {

        return courseRepositories.findById(id).get();
    }
}
