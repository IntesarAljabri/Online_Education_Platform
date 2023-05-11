package Online_Education_Paltform.MyProject.Controllers;
import Online_Education_Paltform.MyProject.Models.Discussion;
import Online_Education_Paltform.MyProject.Services.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "discussion")
public class DiscussionControllers {

    @Autowired
    DiscussionService discussionservice;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Discussion> getAllDiscussion() {

        return discussionservice.getAllDiscussion();
    }
    @GetMapping(value = "getById")
    public Discussion getDiscussionById(@RequestParam Integer id) {

        return discussionservice.getDiscussionById(id);
    }
}
