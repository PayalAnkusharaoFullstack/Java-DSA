import java.util.ArrayList;
import java.util.Scanner;

public class FindIndexOfEle {
public static void main(String[]args){

ArrayList<Integer>cars=new ArrayList<Integer>();

System.out.println("enter number to find index");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(40);
cars.add(20);

int index=-1;

for(int i=0;i<cars.size();i++){

if(cars.get(i)==n){
index=i;
break;
}
}

if(index==-1){
 System.out.println(" ele not found");
    
}else{
System.out.println(" index is:" + index);
}




//small logic

// if(cars.contains(n)){
//     int index=cars.indexOf(n);
//     System.out.println(index);

// }


}
}
