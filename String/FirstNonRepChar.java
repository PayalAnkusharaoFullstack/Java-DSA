import java.util.HashMap;

public class FirstNonRepChar {
       public static void main(String[] args) {
        HashMap<Character,Integer>mymap=new HashMap<>();
            String name="payal";

            for(char ch:name.toCharArray()){

                if(mymap.containsKey(ch)){
                    mymap.put(ch,mymap.get(ch)+1);
                }else{
                    mymap.put(ch,1);
                }

            }

            System.out.println(mymap);

            for(char ch:mymap.keySet()){
                if(mymap.get(ch)==1){
          System.out.println(ch);
                }
            }

    } 
}
