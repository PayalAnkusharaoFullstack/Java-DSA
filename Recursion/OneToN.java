public class OneToN{
static void print(int i) {
  
    if(i>5){
        return;
    }
         System.out.println(i);
    print(i+1);
 
}
public static void main(String[] args) {
   print(1); 
}

}