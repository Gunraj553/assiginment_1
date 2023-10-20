// Author : Gunraj Singh Sodhi C0893229
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Triangle[] triangles = new Triangle[3];
        for (int i =0 ; i < triangles.length ; i++ ){

            System.out.println("Construction of a new point");
            Point s_1 = scan_points.new_point(new Point());
            Point s_2 = scan_points.new_point(new Point());
            Point s_3 = scan_points.new_point(new Point());

            triangles[i] = new Triangle();
            triangles[i].setSide_1(s_1);
            triangles[i].setSide_2(s_2);
            triangles[i].setSide_3(s_3);

            System.out.println("Perimeter: " + triangles[i].perimeter());

            if (triangles[i].isco_tri()) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is not isosceles");
            }

        }

    }
}