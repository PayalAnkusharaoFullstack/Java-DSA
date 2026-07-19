class animal {
    void eat() {
        System.out.println("Eating");
    }
}

class mamal extends animal {
    void walk() {
        System.out.println("Walking");

    }
}

class Dog extends mamal {
    void bark() {
        System.out.println("Barking");

    }
}

public class InheritanceMultilevel {

    public static void main(String[] args) {
Dog d=new Dog();
d.bark();
d.walk();
d.eat();
    }

}