public class NamePrint {

    static void print(int i,int n) {
        if(i>n){
            return;
        }
    System.out.println("payal");
        print(i+1,n);
    }

    public static void main(String[] args) {
        print(1,5);
    }

}
