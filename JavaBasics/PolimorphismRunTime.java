class Animal{
   void display(){
        System.out.println("hi");
    }
}
class cat extends Animal{
   void display(){
        System.out.println("hi dog");
    }
}

public class PolimorphismRunTime {
    public static void main(String[] args) {
        Animal a1=new cat();
        a1.display();

    }
}
