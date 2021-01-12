import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TaskOne {
    private static void ascendingNums(int[] arr) {
        TreeSet<Integer> newArr = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        for (int number : newArr) {
            System.out.print(number+", ");
        }
}
    public static void main(String[] args) {
        int [] arr={1,2,3,7,4,2,3,2,1,4};
        ascendingNums(arr);
    }
}
