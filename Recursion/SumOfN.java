import java.util.Scanner;
public class SumOfN {
    static void sum(int i,int sum,int n){
if(i>5){
  System.out.println(sum);
  return;
}
      sum=sum+i;
      sum(i+1,sum,n);
    }
    
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
sum(1,0,n);

  }  
}
