public class MethodOverloadClass {
     private int baseSalary;
    private int hourlyRate;

    public MethodOverloadClass(int baseSalary, int hourlyRate){
        //we'll use our getter and setter methods 
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }//that's constructor


    //now method overloading
    //we can create same method with different parameter
    
    //if employee working extra hours
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    };

    //if employee doesn't work extra hours
    public int calculateWage(){
        // return baseSalary; that's an approach
        return calculateWage(0);
        //this is method overloading
    };



    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less than 0!!");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less than 0!!");
        }
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
}
