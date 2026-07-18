import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args){

        
ArrayList<Integer>cars=new ArrayList<Integer>();
int ele;

cars.add(10);
cars.add(30);
cars.add(20);
cars.add(45);
cars.add(65);
cars.add(20);


for (int i = 0; i < cars.size(); i++) {
    // System.out.println(i);
 ele=cars.get(i);

 if(ele!=ele){
    System.out.println(cars.remove(ele));
 }


}



    }
}
