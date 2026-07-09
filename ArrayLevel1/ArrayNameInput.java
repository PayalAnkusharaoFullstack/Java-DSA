import java.util.Scanner;

public class ArrayNameInput {
       public static void main(String args[]) {

System.out.println("enter size of array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
String arr[]=new String [size];
sc.nextLine();

for (int i = 0; i < arr.length; i++) {
   System.out.println("enter Name "+ (i+1) +" of array");
   arr[i]=sc.nextLine();
}

for (int i = 0; i < arr.length; i++) {
   System.out.println("Name "+ (i+1) +" of array is");
   System.out.println(arr[i]);
}








   }
}
