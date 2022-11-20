package in.advertiss.springcore.java_config;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    @Override
    public String draw() {
        return "Drawing circle!!";
    }

    @Override
    public String calculateArea() {
        return "Circle area calculated";
    }
}
