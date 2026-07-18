import java.util.ArrayList;

public class SecondLArgestNum {
        public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();

int largestNum=Integer.MIN_VALUE;
int SecondLArgest=0;

cars.add(10);
cars.add(30);
cars.add(65);
cars.add(20);
cars.add(45);
cars.add(90);

for(Integer i:cars){

    if(largestNum<i){
SecondLArgest=largestNum;
        largestNum=i;
    }

  
}
          System.out.println(largestNum);
          System.out.println(SecondLArgest);





}
}
