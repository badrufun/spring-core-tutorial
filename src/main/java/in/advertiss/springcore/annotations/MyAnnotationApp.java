package in.advertiss.springcore.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApp {
    public static void main(String[] args){

        //create context using config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationAnnotationContext.xml");

        //get bean from context -->> default bean id same as class name with 1st char lower case
        Coach coach = context.getBean("baseBallCoach", Coach.class);

        //print bean data
        System.out.println(coach.getDailyWorkout());

        //fortune print
        System.out.println(coach.getFortune());

        //close context
        context.close();
    }
}