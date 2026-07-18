import java.util.ArrayList;

public class PositiveNegativeCount {
        public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();

int PositiveCount=0;
int NegativeCount=0;

cars.add(10);
cars.add(30);
cars.add(-20);
cars.add(-20);
cars.add(65);

for(Integer i:cars){

    if(i<0){
    NegativeCount=NegativeCount+1;
    }else{
       PositiveCount=PositiveCount+1;  
    }
}
    System.out.println("NegativeCount:"+NegativeCount);
     System.out.println("PositiveCount:"+PositiveCount);




}
   
 
 
}
