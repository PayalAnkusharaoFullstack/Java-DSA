import java.util.HashMap;

public class HashMapQueriesFreq {
    public static void main(String[]args){

 int arr[] = {2, 23, 4, 55, 56, 2, 23};
 int queries[] = {2, 23, 56, 100};


        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int num : arr) {

            if (mymap.containsKey(num)) {
                mymap.put(num, mymap.get(num) + 1);
            } else {
                mymap.put(num, 1);
            }
        }

        for(int q:queries){

            if(mymap.containsKey(q)){
                System.out.println(q +"->"+mymap.get(q));
            }else{
                System.out.println(q+"=>"+0);

            }

        }
    }
}
