class car{
String name;
int price;
car(String name,int price){
    this.name=name;
    this.price=price;
}

}
public class ParameterisedCon {
    public static void main(String[] args) {
        car c1=new car("a",6);
        System.out.println(c1.name);
        System.out.println(c1.price);

       

    }
}
