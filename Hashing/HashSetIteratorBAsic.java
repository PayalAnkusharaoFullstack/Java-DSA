import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorBAsic {
     public static void main (String args[]){
HashSet<Integer> SetName=new HashSet<>();

SetName.add(1);
SetName.add(2);
SetName.add(3);

Iterator it=SetName.iterator();

while (it.hasNext()) {
System.out.println(it.next());
    
}
     }
}
