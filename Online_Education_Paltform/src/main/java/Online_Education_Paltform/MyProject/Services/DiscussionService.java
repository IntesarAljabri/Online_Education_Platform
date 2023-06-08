package Online_Education_Paltform.MyProject.Services;

import Online_Education_Paltform.MyProject.Models.Course;
import Online_Education_Paltform.MyProject.Models.Discussion;
import Online_Education_Paltform.MyProject.Repositories.CourseRepositories;
import Online_Education_Paltform.MyProject.Repositories.DiscussionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscussionService {
    @Autowired
    DiscussionRepositories discussionRepositories;
    public List<Discussion> getAllDiscussion() {

        return discussionRepositories.findAll();
    }
    public Discussion getDiscussionById(Integer id) {

        return discussionRepositories.findById(id).get();
    }
}
