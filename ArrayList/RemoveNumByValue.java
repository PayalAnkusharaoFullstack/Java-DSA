import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNumByValue {
   
public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);

System.out.println("enter value to remove");
int n=sc.nextInt();

int index;

cars.add(10);
cars.add(30);
cars.add(-20);
cars.add(-20);
cars.add(65);


index=cars.indexOf(n);
cars.remove(index);

    


System.out.println(cars);


}
}
