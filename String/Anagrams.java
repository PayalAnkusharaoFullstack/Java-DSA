import java.util.HashMap;

public class Anagrams {
       public static void main(String[] args) {
        HashMap<Character,Integer>mymap=new HashMap<>();
            String str1="payal";
            String str2="yalpa";

            System.out.println("first string");

            for(char ch:str1.toCharArray()){

                if(mymap.containsKey(ch)){
                    mymap.put(ch,mymap.get(ch)+1);
                }else{
                    mymap.put(ch,1);
                }

            }

            
            System.out.println(mymap);


            System.out.println("second string");

            for(char ch:str2.toCharArray()){

                if(mymap.containsKey(ch)){
                    mymap.put(ch,mymap.get(ch)+1);
                }else{
                    mymap.put(ch,1);
                }

            }



            
            System.out.println(mymap);




    } 
}
