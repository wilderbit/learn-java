import com.learnspring.service.SpeakerService;
import com.learnspring.service.SpeakerServiceImpl;

public class Application {
    
    public static void main(String... args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println("Application.main" + speakerService.findAll().get(0).getFirstName());
    }
}
