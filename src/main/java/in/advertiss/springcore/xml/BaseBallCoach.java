package in.advertiss.springcore.xml;

import in.advertiss.springcore.xml.Coach;
import in.advertiss.springcore.xml.FortuneService;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Practice 30 mins daily!";
    }

    public String getFortune(){
        return fortuneService.getFortune();
    }
}
