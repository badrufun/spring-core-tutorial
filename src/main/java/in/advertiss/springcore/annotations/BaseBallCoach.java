package in.advertiss.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseBallCoach implements Coach {

    //Feild injection --> internally done using java reflection
    //excutes after constructor injection then setter injection
    @Autowired
    @Qualifier("goodFortuneService")
    private FortuneService fortuneService;

    //Auto-injection using constructor happening
    @Autowired
    public BaseBallCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Constructor is called for fortune service injection!!");
    }

    public String getDailyWorkout(){
        return "Practice 30 mins daily!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    //Auto-injection happening using setter
    //if Auto constructor is also there, then first it will be injected by constructor then by setter
    //Setter injection will override the constructor injection
    //Also feild inject
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Setter is called for fortune service injection!!");
    }
}
