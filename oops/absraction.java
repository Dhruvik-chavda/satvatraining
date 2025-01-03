// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void sound();

    public void eat() {
        System.out.println("This animal is eating.");
    }
}


class Dog extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Dog barks.");
    }
}


class Cat extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling methods on the objects
        dog.sound();  
        dog.eat();    

        cat.sound(); 
        cat.eat();    
    }
}