import java.util.*;
public class BasicEle{
    public static void main(String[]args){

ArrayList<Integer>cars=new ArrayList<Integer>();

int sum=0;
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(40);
cars.add(65);

System.out.println(cars);

// Collections.sort(cars);
// System.out.println(cars);

Collections.reverse(cars);
System.out.println(cars);

// System.out.println(cars.size());

// for(Integer i:cars){
//     sum=sum+i;
// }
//     System.out.println(sum);


// for(Integer i:cars){
// if(i>max){
//     max=i;
// }
// }
   
// System.out.println(max);


// for(Integer i:cars){
// if(i<min){
//     min=i;
// }
// }
   
// System.out.println(min);

// System.out.println(cars.get(3));

// System.out.println(cars.indexOf(40));

// if(cars.contains(90)){
//     System.out.println("yes");

// }

    }


}