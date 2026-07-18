import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceEle {
public static void main(String[] args) {
        
ArrayList<Integer>cars=new ArrayList<Integer>();

System.out.println("enter number to search");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

System.out.println("enter number to replace");
int Mynum=sc.nextInt();

int index;
int replace;


cars.add(10);
cars.add(30);
cars.add(-20);
cars.add(-20);
cars.add(65);


if(cars.contains(n)){
    index=cars.indexOf(n);
    replace=cars.set(index,Mynum);
    System.out.println(cars);
}


            }
}
