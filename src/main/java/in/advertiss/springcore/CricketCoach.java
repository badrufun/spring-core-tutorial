package in.advertiss.springcore;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice batting daily!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter called!!");
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCoachDetails(){
        return "Email : " + email + " Team : " + team;
    }

    public void initMethod(){
        System.out.println("Init-method called!");
    }

    public void destroyMethod(){
        System.out.println("destroy-method called!");
    }
}
