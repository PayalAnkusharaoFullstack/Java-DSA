
import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap <String,Integer> mymap=new HashMap<>();

        mymap.put("payal", 3);
        mymap.put("a", 3);
        mymap.put("b", 2);

        // mymap.remove("a");
        // mymap.put("a", 3);

        // System.out.println(mymap);
        // System.out.println(mymap.keySet());
        // System.out.println(mymap.values());
        // System.out.println(mymap.get("payal"));

        // if(mymap.containsKey("r")){
        //             System.out.println("yes");

        // }

// for(String key:mymap.keySet()){
//     System.out.println(key);
// }

// for(int values:mymap.values()){
//     System.out.println(values);
// }

// for(String key:mymap.keySet()){
//     System.out.println(mymap.get(key)+ "-> " + key );
// }

for(HashMap.Entry<String,Integer>e:mymap.entrySet()){
    System.out.println(e.getKey()+ "-> " + e.getValue());

}

    }
}
