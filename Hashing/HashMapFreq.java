
import java.util.HashMap;

public class HashMapFreq {
    public static void main(String[] args) {

        int arr[] = {2, 23, 4, 55, 56, 2, 23};

        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int num : arr) {

            if (mymap.containsKey(num)) {
                mymap.put(num, mymap.get(num) + 1);
            } else {
                mymap.put(num, 1);
            }
        }

        System.out.println(mymap);
    }
}
