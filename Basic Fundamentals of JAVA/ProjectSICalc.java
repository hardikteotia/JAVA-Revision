import java.util.Scanner;

public class ProjectSICalc {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        int p = scanner.nextInt();
        System.out.print("Rate : ");
        int r = scanner.nextInt();
        System.out.print("Time :");
        int t = scanner.nextInt();

        int SI = (p*r*t)/100;
        System.out.println("Simple Interest : " + SI);

        scanner.close();
        

    }
}
