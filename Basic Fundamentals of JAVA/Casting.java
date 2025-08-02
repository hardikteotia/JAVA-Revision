public class Casting {
    public static void main (String args []){
        short x = 1;
        int y = x+2; // implicit casting from short to int
        System.out.println(y);
        double z = 3.14;
        double w= z + 1; // implicit casting from double to double
        System.out.println(w);

        double a = 1.5;
        int b = (int) a + 2; // explicit casting from double to int\
        System.out.println(b);

        String str = "123";
        int val =  Integer.parseInt(str);
        System.out.println(val + 1); // converting string to int
    }
}
