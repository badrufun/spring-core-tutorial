package in.advertiss.springcore;

public class MyApp {
    public static void main(String[] args){
        //Coach theCoach = new BaseBallCoach();
        Coach theCoach = new TrackCoach(); //Using any of coach object
        //But object is not configurable
        System.out.println(theCoach.getDailyWorkout());
    }
}
