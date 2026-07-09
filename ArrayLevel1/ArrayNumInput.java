import java.util.Scanner;
public class ArrayNumInput {
   public static void main(String args[]) {

System.out.println("enter size of array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int [size];

for (int i = 0; i < arr.length; i++) {
   System.out.println("enter element "+ (i+1) +" of array");
   arr[i]=sc.nextInt();
}

for (int i = 0; i < arr.length; i++) {
   System.out.println("element "+ (i+1) +" of array is");
   System.out.println(arr[i]);
}








   }
}
