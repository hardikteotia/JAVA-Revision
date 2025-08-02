import java.util.Scanner;

public class ifStatements {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature : ");
        int temp = scanner.nextInt();
        if (temp > 25) {
            System.out.println("It's a hot day");
        }
        else{
            System.out.println("It's a cold day");
        }
    }
}
