import java.util.HashSet;

public class TaskThree {
    private static void numOfUniqueStrings(String[] strs){
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            set.add(strs[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
    public static void main(String[] args) {
        String [] strs={"java", "phython", "javascript", "c#", "java", "c++"};
        numOfUniqueStrings(strs);
    }
}
