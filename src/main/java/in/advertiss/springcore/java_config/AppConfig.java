package in.advertiss.springcore.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.advertiss.springcore.java_config")
public class AppConfig {

    @Bean
    public AreaCalculator triangleAreaCalculator(){
        return new TriangleAreaCalculator();
    }
    @Bean
    public Shape triangle(){
        return new Triangle(triangleAreaCalculator());
    }
}
