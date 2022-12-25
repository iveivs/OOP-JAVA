package Les01.Ex02;

public class Prgrm {
        static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String args) {
        Point2D a = new Point2D(0 , 2);

        // System.out.println(a.getInfo());
        System.out.println(a);

        Point2D b = new Point2D(10);

        System.out.println(b);
        System.out.println(distance(a, b));
    }
}


// public static void main(String args) {
//     Point2D a = new Point2D();
//     a.x = 0;
//     a.y = 2;
//     System.out.println(a.toString());

//     Point2D b = new Point2D();
//     b.x = 0;
//     b.y = 2;
//     System.out.println(b.toString());
//     System.out.println(distance(a, b));