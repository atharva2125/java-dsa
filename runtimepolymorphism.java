// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the parent's method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the parent's method
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class runtimepolymorphism {
    public static void main(String[] args) {
        // Reference is of the parent type (Animal), but the object is of the child type (Dog).
        Animal myAnimal1 = new Dog();

        // Reference is of the parent type (Animal), but the object is of the child type (Cat).
        Animal myAnimal2 = new Cat();

        // The JVM checks the actual object type at RUNTIME to decide which
        // makeSound() method to execute.
        myAnimal1.makeSound(); // Calls the Dog's makeSound() method
        myAnimal2.makeSound(); // Calls the Cat's makeSound() method
    }
}