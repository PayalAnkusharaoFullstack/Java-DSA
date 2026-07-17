import java.util.ArrayList;

public class OddNumCount {
    public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();

int oddcount=0;

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(45);
cars.add(65);

for(Integer i:cars){

    if(i%2!=0){
    oddcount=oddcount+1;
    }
}
    System.out.println(oddcount);




}
   
 
   
}
