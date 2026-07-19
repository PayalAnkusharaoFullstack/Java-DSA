class Students{
String name;
int age;

 void print(){
     System.out.println(name);
 }
}
public class ClassAndObj {
    public static void main(String[] args) {
        
       Students s1=new Students();
       s1.name="payal";
       s1.age=5;

       System.out.println(s1.name);
       System.out.println(s1.age);
       s1.print();
  

       Students s2=new Students();
       s2.name="p";
       s2.age=4;

       System.out.println(s2.name);
       System.out.println(s2.age);
       s2.print();




    }
}
