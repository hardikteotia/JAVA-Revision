import java.util.Scanner;

public class ReadingInput {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = scanner.nextInt();
        System.out.println(("age:" + age));
    }
}
