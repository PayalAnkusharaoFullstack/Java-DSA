public class Palindrome {
      public static void main(String []args){
    int n=121;
int rev=0;
int temp=n;
    while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    if(rev==temp){
                System.out.println("pelindrome");

    }else{
                System.out.println("not");

    }
  } 
}
