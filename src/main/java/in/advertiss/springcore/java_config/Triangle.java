package in.advertiss.springcore.java_config;

public class Triangle implements Shape {

    private AreaCalculator areaCalculator;

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
}
