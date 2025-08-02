import java.lang.Math;
public class MathClass {
    public static void main (String args []){
        int res = Math.round(1.1F);
        System.out.println(res); // 1
        int res2 = (int)Math.ceil(1.5F);
        System.out.println(res2); // 2
        int res3 = (int)Math.floor(1.5F);
        System.out.println(res3); // 1
        int res4 = (int)Math.max(1, 2);
        System.out.println(res4); // 2
        double res5 = Math.random() *100;
        System.out.println(Math.round(res5)); // random number between 0 and 100
    }
}
