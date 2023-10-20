public class Triangle {
   Point side_1;
   Point side_2;

   Point side_3;

    public void setSide_1(Point side_1) {
        this.side_1 = side_1;
    }
    public void setSide_2(Point side_2){
        this.side_2 = side_2;
    }

    public void setSide_3(Point side_3) {
        this.side_3 = side_3;
    }

    public Point getSide_1() {
        return side_1;
    }

    public Point getSide_2() {
        return side_2;
    }

    public Point getSide_3() {
        return side_3;
    }

    public double perimeter() {

        double length_1 = calaculate_length.find_length(side_1,side_2);
        double length_2 = calaculate_length.find_length(side_2,side_3);
        double length_3 = calaculate_length.find_length(side_3,side_1);
        double total_length = length_1 + length_2+length_3;

        return  total_length;

    }

    public boolean isco_tri(){

        boolean is_isco = false;
        double length_1 = calaculate_length.find_length(side_1,side_2);
        double length_2 = calaculate_length.find_length(side_2,side_3);
        double length_3 = calaculate_length.find_length(side_3,side_1);

        if (length_1 == length_2 || length_2 == length_3 || length_3 == length_1){
            is_isco = true;
        }

        return is_isco;

    }
}
