package in.advertiss.springcore.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApp {
    public static void main(String[] args){

        //create context using config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");

        //get bean from context
        Coach coach = context.getBean("newCoach", Coach.class);

        //print bean data
        System.out.println(coach.getDailyWorkout());

        //close context
        context.close();
    }
}
