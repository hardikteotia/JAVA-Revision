public class MethodOverloadMain {
    public static void main(String[] args) {

        var Employee = new MethodOverloadClass(
            10_000, 20);

        int wage = Employee.calculateWage();

        System.out.println(wage);
    }
    
}
