class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method of Animal class
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
    
    // Method overloading
    void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Bark");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Outputs "Some sound"
        
        Dog dog = new Dog();
        dog.makeSound(); // Outputs "Bark"
        dog.makeSound(3); // Outputs "Bark" three times
    }
}

