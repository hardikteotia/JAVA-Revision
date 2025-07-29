import java.util.Arrays;

public class MultiDimArray {
    public static void main(String args []){
        int arr[][] =  new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        System.out.println(Arrays.deepToString(arr));

        int arr2[][] = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2));
    }
}
