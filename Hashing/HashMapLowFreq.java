import java.util.HashMap;

public class HashMapLowFreq {
   public static void main(String[] args) {

        int arr[] = {5, 4, 55, 56, 5, 23};

        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int num : arr) {

            if (mymap.containsKey(num)) {
                mymap.put(num, mymap.get(num) + 1);
            } else {
                mymap.put(num, 1);
            }
        }

        int min=Integer.MAX_VALUE;
        int ans=-1;

for(int key:mymap.keySet()){
if(mymap.get(key)<min){
    min=mymap.get(key);
    ans=key;
}
}    
        System.out.println(ans+"->"+min);
    }  
}
