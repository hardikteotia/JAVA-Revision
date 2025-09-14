public class AbstractionMain {
    public static void main(String[] args) {
        var Employee = new AbstractionClass();
        //Employee.baseSalary = 10_000;
        Employee.setBaseSalary(10_000);
        //Employee.getBaseSalary();//dont need this so setting them as private in class that's abstraction
        //Employee.hourlyRate = 50;
        Employee.setHourlyRate(-1);
        //Employee.getBaseSalary();//dont need this so setting them as private in class that's abstraction

        int wage = Employee.calculateWage(10);
        System.out.println(wage);
    }
    
}
