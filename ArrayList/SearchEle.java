import java.util.*;

public class SearchEle {
     public static void main(String[]args){

ArrayList<Integer>cars=new ArrayList<Integer>();

System.out.println("enter number to search");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

boolean IsFound =false;

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(40);
cars.add(20);

for(int i:cars){
if(i==n){
    IsFound=true;
    break;
}

}

    if(IsFound==true){
    System.out.println("found");

    }else{
            System.out.println("not found");

    }


    }
}
