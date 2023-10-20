public class calaculate_length {
    public static double find_length(Point point_1, Point point_2){
        return Math.sqrt(Math.pow(point_1.getX() - point_2.getX(), 2) + Math.pow(point_1.getY() - point_2.getY(), 2));
    }
}
