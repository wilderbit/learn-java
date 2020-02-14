import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Application context

@Configuration
@ComponentScan({"com.learnspring"})
public class AppConfig {
    
    /*
    @Bean(name = "speakerRepository")
    public SpeakerRepo getSpeakerRepo() {
        return new HibernateSpeakerRepoImpl();
    }
    */

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo());
        //service.setSpeakerRepo(getSpeakerRepo());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }
    
    */
}
