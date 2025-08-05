public class ConstructorMain {
    public static void main(String[] args) {
        


        //lets suppose we forget to call these methods
        //then our program will start in invalid state
        //and we will get an exception when we try to calculate wage

        // Employee.setBaseSalary(10_000);
        // Employee.setHourlyRate(20);

        //so will create a constructor, in class file
        //a constructor is a special method that is called when an object is created
        var Employee = new ConstructorClass(
                    50_000, 20);


        int wage = Employee.calculateWage(10);
        System.out.println(wage);
    }
}
