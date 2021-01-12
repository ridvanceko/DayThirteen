import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TaskFive {

    private static String[] descendingUniqueString(ArrayList<String> str){
        TreeSet<String> tree=new TreeSet<>(str); // converted to treeList
        TreeSet<String> tree2=new TreeSet<>(tree.descendingSet());//reversed
        String [] strArr=new String[tree2.size()];
        int i=0;
        for (String newStr:tree2) { // Sets --> Array or ArrayList
            strArr[i]=newStr;
            i++;
        }
        return strArr;
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("java");
        list.add("java");
        list.add("javascript");
        list.add("c++");
        list.add("python");
        list.add("python");
        list.add("python");
        list.add("c++");
        System.out.println(Arrays.toString(descendingUniqueString(list)));
    }
}
