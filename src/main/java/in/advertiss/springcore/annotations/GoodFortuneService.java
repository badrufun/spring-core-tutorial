package in.advertiss.springcore.annotations;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "GoodFortuneService:Today is your lucky day!";
    }
}
