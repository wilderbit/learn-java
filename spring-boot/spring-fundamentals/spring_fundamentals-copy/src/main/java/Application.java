import com.learnspring.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    public static void main(String... args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            AppConfig.class);
        // SpeakerService speakerService = new SpeakerServiceImpl();
        SpeakerService speakerService = applicationContext
            .getBean("speakerService", SpeakerService.class);
        System.out.println("Application.main" + speakerService.findAll().get(0).getFirstName());
    }
}
