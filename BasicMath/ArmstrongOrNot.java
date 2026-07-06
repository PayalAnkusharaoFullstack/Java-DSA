public class ArmstrongOrNot {
  public static void main(String []args){
    int n=92727;
int sum=0;
int temp=n;
int digits = String.valueOf(n).length();
    while(n>0){
        int digit=n%10;
        sum=sum+(int)Math.pow(digit, digits);
        n=n/10;
    }
if(sum==temp){
               System.out.println("armstrong");
}else{
               System.out.println("not armstrong");

}
}  
}
