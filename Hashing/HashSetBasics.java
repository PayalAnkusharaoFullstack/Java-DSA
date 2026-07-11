
import java.util.HashSet;

public class HashSetBasics {
 public static void main (String args[]){
HashSet<Integer> SetName=new HashSet<>();

SetName.add(3);
SetName.add(2);
SetName.add(3);

SetName.remove(2);

if(SetName.contains(2)){
    System.out.println("yes");
}else{
    System.out.println("no");

}

System.out.println(SetName.size());
System.out.println(SetName);

    }
}
