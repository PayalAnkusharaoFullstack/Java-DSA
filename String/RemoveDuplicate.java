
import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String str = "fjrnvdjbbh";
        String result="";
        for (char i : str.toCharArray()) {
            if (!set.contains(i)) {
                set.add(i);
                result=result+i;

            }

        }
        System.out.println(result);

    }
}
