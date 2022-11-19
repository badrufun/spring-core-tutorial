package in.advertiss.springcore.annotations;

import org.springframework.stereotype.Component;

@Component("newCoach")
public class BaseBallCoach implements Coach {
    public String getDailyWorkout(){
        return "Practice 30 mins daily!";
    }
}
