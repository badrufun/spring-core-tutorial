package in.advertiss.springcore.xml;

import in.advertiss.springcore.xml.Coach;
import in.advertiss.springcore.xml.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Run 5 km daily!";
    }

    @Override
    public String getFortune(){
        return fortuneService.getFortune();
    }
}
