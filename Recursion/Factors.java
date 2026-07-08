
import java.util.Scanner;

public class Factors {
    static void factorial(int n,int i) {

        if(n<i){
            return;
        }
        if(n%i==0){
System.out.println(i);
}
        factorial(n, i+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n,1);
    }
}
