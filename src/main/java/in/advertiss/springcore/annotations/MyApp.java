package in.advertiss.springcore.annotations;

import in.advertiss.springcore.xml.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = context.getBean("theCoach5", CricketCoach.class);
        context.close();
    }
}
