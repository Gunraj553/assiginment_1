// This class is used to scan points and make a new object of each x,y coordinates.
import java.util.Scanner;
public class scan_points {
    public static Point  new_point(Point input){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        input.setX(x);
        input.setY(y);
        return input;
    }
}
