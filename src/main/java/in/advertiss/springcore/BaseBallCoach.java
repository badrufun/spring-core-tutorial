package in.advertiss.springcore;

public class BaseBallCoach implements Coach{

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
