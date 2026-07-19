class Flower{
String name;

Flower(String name){
this.name=name;
}

Flower(Flower f){
this.name=f.name;
}


}
public class CopyConstructor {
    public static void main(String[] args) {
       Flower f1=new Flower("payal");
      Flower f2=new Flower(f1);

System.out.println(f1.name);
System.out.println(f2.name);

       
    }
}
