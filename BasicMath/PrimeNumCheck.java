public class PrimeNumCheck {
         public static void main(String args[]){
        int n=3;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
count++;
            }
        }
        if(count==2){
            System.err.println("prime");
        }else{
            System.err.println("not");
        }

    }
}
