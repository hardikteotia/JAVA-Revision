public class Strings {
    public static void main(String args []){
        String str = "Hello, World!";
        System.out.println(str.endsWith("!!!!!!"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.length());
        System.out.println(str.replace("!", "!!!"));
        System.out.println(str);// which shows that strings are immutable in Java
    }
}
