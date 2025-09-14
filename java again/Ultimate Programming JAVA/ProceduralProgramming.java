public class ProceduralProgramming {
    public static void main(String args []){
        //calculating the wages of employees
        int baseSalary = 10_000;
        int extraHours = 10;
        int hourlyRate = 50;

        int wages = wages(baseSalary, extraHours, hourlyRate);
        System.out.println(wages);
    }


    public static int wages(int baseSalary,
                            int extraHours,
                            int hourlyRate){
                                return baseSalary + (extraHours*hourlyRate);
                            }
}
