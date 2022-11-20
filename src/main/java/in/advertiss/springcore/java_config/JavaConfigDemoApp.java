package in.advertiss.springcore.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args){

        //create context using config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        /*Shape shape = context.getBean("circle", Shape.class);
        System.out.println(shape.draw());*/

        Shape shape = context.getBean("triangle", Shape.class);
        System.out.println(shape.draw());
        System.out.println(shape.calculateArea());

        //close context
        context.close();
    }
}
