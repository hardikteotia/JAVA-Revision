import java.awt.Point;

public class PrimituveVsReference {
    public static void main(String args []){
        //primitive type
        int x= 2;
        int y = x;
        System.out.println(x);
        System.out.println(y);
        x = 5;
        System.out.println(x);
        System.out.println(y);

        // reference type
        Point point1 = new Point(2,3);
        Point point2 = point1;
        System.out.println("    " + point1);
        System.out.println("    " +point2);
        point1.x=10;
        System.out.println(point1);
        System.out.println(point2); // point2 is also changed because it references the same object as point1

    }
}
