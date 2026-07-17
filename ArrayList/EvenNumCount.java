import java.util.ArrayList;

public class EvenNumCount {
public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();

int evencount=0;

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(45);
cars.add(65);

for(Integer i:cars){

    if(i%2==0){
    evencount=evencount+1;
    }
}
    System.out.println(evencount);




}
   
 
   
}
