package in.advertiss.springcore.xml;

import in.advertiss.springcore.xml.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
