public class Factorials {
    static void Factorials(int factorial,int i,int n) {
        
        if(i>n){
            System.out.println(factorial);
            return;
        }

        factorial=factorial*i;

        Factorials(factorial,i+1, n);


    }
    public static void main(String[] args) {

       Factorials(1,1,3); 
    }
}
