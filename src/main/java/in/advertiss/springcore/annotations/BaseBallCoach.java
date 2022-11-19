package in.advertiss.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BaseBallCoach(FortuneService fortuneService) {
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

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Setter is called for fortune service injection!!");
    }*/
}
