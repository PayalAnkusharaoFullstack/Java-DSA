
import java.util.HashSet;

public class HashSetUnionOfArray {
    public static void main(String[]args){
        
        int arr1[] = {1, 2, 3, 4, 5,5};
        int arr2[] = {1, 2, 3};

        HashSet<Integer> set=new HashSet<>();

        for(int i:arr1){
            set.add(i);
        }

           for(int i:arr2){
            set.add(i);
        }
  
System.out.println(set);
    }
}
