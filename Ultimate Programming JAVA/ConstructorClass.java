public class ConstructorClass {

    private int baseSalary;
    private int hourlyRate;

    public ConstructorClass(int baseSalary, int hourlyRate){
        //we'll use our getter and setter methods 
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
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
