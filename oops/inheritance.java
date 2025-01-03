// Base class (Superclass) - Hierarchical Inheritance
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Derived class 1 (Subclass of Animal) - Single Inheritance
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Derived class 2 (Subclass of Animal) - Hierarchical Inheritance
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Derived class 3 (Subclass of Dog) - Multilevel Inheritance
class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy is playing.");
    }
}

// Main class to test all types of inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance: Dog inherits from Animal
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Defined in Dog class

        // Hierarchical Inheritance: Cat inherits from Animal
        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal class
        cat.meow(); // Defined in Cat class

        // Multilevel Inheritance: Puppy inherits from Dog, which inherits from Animal
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal class
        puppy.bark(); // Inherited from Dog class
        puppy.play(); // Defined in Puppy class
    }
}