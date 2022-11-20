package in.advertiss.springcore.java_config;

import in.advertiss.springcore.annotations.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args){

        //create context using config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Shape shape = context.getBean("circle", Shape.class);

        System.out.println(shape.draw());

        //close context
        context.close();
    }
}
