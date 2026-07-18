import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNumByIndex {
    
public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);

System.out.println("enter index to remove");
int index=sc.nextInt();



cars.add(10);
cars.add(30);
cars.add(-20);
cars.add(-20);
cars.add(65);



System.out.println(cars.remove(index));

    


System.out.println(cars);


} 
}
