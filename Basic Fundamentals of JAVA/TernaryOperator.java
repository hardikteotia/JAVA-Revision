import java.lang.classfile.constantpool.StringEntry;

public class TernaryOperator {
    public static void main(String[] args) {
        int income = 100_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className); 
    }
}
