import java.util.TreeSet;

public class TaskTwo {
    private static void descendingNums(int[] arr) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }
        TreeSet<Integer> newArr = new TreeSet<>(numbers.descendingSet());
        for (int num : newArr) {
            System.out.print(num + ", ");
        }
    }
    public static void main(String[] args) {
        int [] array={2,3,7,4,1,5,1,6,3,5,7};
        descendingNums(array);
    }
}
