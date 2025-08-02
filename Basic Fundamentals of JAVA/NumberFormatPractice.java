import java.text.NumberFormat;
public class NumberFormatPractice {
    public static void main (String args []){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println(result); // $1,234,567.89 (or similar format based on locale)
    }
}
