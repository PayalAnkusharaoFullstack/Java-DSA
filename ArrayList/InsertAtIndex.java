import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtIndex {
                public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);

System.out.println("enter number to insert");
int Mynum=sc.nextInt();

System.out.println("enter index where num is insert");
int index=sc.nextInt();



cars.add(10);
cars.add(30);
cars.add(-20);
cars.add(-20);
cars.add(65);


for(int i:cars){

    cars.set(index,Mynum);

}
System.out.println(cars);


}


            }
