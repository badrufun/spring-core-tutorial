package in.advertiss.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args){
        //Coach theCoach = new BaseBallCoach();
        //Coach theCoach = new TrackCoach(); //Using any of coach object
        //But object is not configurable
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //based on configuration file the coach object will be created
        //Coach theCoach;
        //Constructor injection
        /*theCoach = context.getBean("theCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());*/

        //Setter injection example
        /*theCoach = context.getBean("theCoach2", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());*/

        //injecting literals and reading values from properties file
        /*CricketCoach cricketCoach = context.getBean("theCoach3", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getFortune());
        System.out.println(cricketCoach.getCoachDetails());*/

        //Scope -> default scope is singleton
        //getting bean theCoach3 and printing email
        /*CricketCoach cricketCoach = context.getBean("theCoach3", CricketCoach.class);
        System.out.println(cricketCoach.getCoachDetails());
        //changing email
        cricketCoach.setEmail("advertiss@gmail.com");

        //getting again bean theCoach3 and printing email
        cricketCoach = context.getBean("theCoach3", CricketCoach.class);
        System.out.println(cricketCoach.getCoachDetails());//returning same object I made changes above*/

        //prototype
        //getting bean theCoach3 and printing email
        /*CricketCoach cricketCoach = context.getBean("theCoach4", CricketCoach.class);
        System.out.println(cricketCoach.getCoachDetails());
        //changing email
        cricketCoach.setEmail("advertiss@gmail.com");

        //getting again bean theCoach3 and printing email
        cricketCoach = context.getBean("theCoach4", CricketCoach.class);
        System.out.println(cricketCoach.getCoachDetails());//returning new object*/

        //lifecycle methods
        CricketCoach cricketCoach = context.getBean("theCoach5", CricketCoach.class);
        context.close();//shutdown container and destroy method will be called
    }
}
