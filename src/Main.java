
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        System.out.println("Enter the speed of the car in km/h");
        var speed = scaner.nextDouble();
        while(true){
            System.out.println("Enter the travel time in hours");
            var time = scaner.nextDouble();
            if (time==0)
                break;
            var distance = speed*time;
            System.out.println("The distance traveled by the car is " + distance+ "km");
        }
    }
}