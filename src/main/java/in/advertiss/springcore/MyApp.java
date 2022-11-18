package in.advertiss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){
        //Coach theCoach = new BaseBallCoach();
        //Coach theCoach = new TrackCoach(); //Using any of coach object
        //But object is not configurable
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //based on configuration file the coach object will be created
        Coach theCoach;
        //Constructor injection
        /*theCoach = context.getBean("theCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());*/

        //Setter injection example
        theCoach = context.getBean("theCoach2", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());
    }
}
