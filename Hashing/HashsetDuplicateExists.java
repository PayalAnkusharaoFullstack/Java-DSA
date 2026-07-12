import java.util.*;

public class HashsetDuplicateExists {
 public static void main(String[] args) {
    
int arr[] = {1, 2, 3, 4, 5,5};

HashSet<Integer> set=new HashSet<>();

boolean duplicate=false;

for(int i:arr){
    if(set.contains(i)){
        duplicate=true;
    break;
    }else{
         set.add(i);
    }   
}
System.out.println(duplicate);

 }   
}
