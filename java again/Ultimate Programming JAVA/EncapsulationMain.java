public class EncapsulationMain {
    public static void main(String[] args) {

        //there is one problem if we take input from user and it can enter values like -1 or smthing
        // var Employee = new EncapsulationEmployee();

        // Employee.baseSalary = 10_000;
        // Employee.hourlyRate = 50;

        // int wage = Employee.calculateWage(10);
        // System.out.println(wage);

        
        //here is the solution
        var Employee = new EncapsulationEmployee();
        //Employee.baseSalary = 10_000;
        Employee.setBaseSalary(10_000);
        Employee.getBaseSalary();
        //Employee.hourlyRate = 50;
        Employee.setHourlyRate(-1);
        Employee.getBaseSalary();

        int wage = Employee.calculateWage(10);
        System.out.println(wage);
    }
}
