public class EncapsulationEmployee {
    
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    };

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less than 0!!");
        }
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less than 0!!");
        }
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
