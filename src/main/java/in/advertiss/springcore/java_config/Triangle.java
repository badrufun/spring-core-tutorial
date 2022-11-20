package in.advertiss.springcore.java_config;

import org.springframework.beans.factory.annotation.Value;

public class Triangle implements Shape {

    private AreaCalculator areaCalculator;

    @Value("${shape.message}")
    private String message;

    public Triangle(AreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    @Override
    public String draw() {
        return "Drawing triangle!!";
    }

    @Override
    public String calculateArea(){
        return areaCalculator.calculateArea();
    }

    public String getMessage(){
        return message;
    }
}
