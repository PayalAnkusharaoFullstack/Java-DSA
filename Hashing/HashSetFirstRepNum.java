
import java.util.HashSet;

public class HashSetFirstRepNum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 5, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println(i);
break;
            }else{
                set.add(i);
            }
        }

    }
}
