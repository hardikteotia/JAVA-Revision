import java.lang.reflect.Array;
import java.util.Arrays;
public class array {
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 24;
        arr[2] = 13;
        arr[3] = 4;
        arr[4] = 45;  
        int[] arr2 = {3,4,5,6,7};
        System.out.println(Arrays.toString(arr)); 
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
