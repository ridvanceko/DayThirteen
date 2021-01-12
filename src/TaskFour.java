
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TaskFour {

    private static ArrayList<String> uniqueStrings(String[] str){
        TreeSet<String> tree=new TreeSet<>(Arrays.asList(str));
        ArrayList<String> newStr=new ArrayList<>(tree);
        return newStr;
    }
    public static void main(String[] args) {
        String [] str=new String[5];
        Scanner input=new Scanner(System.in);
        /*int num=4;
        while(num>=0){
            System.out.println("Enter a String:");
            str[num]=input.next(); // {"0","1","2","3","4"}
            num--;
        }*/
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter "+(i+1)+". String:");
            str[i]=input.next();
        }
        System.out.println(uniqueStrings(str));
    }
}
