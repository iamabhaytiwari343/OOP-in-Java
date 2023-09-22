abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Abstract method to make a sound
    public abstract void makeSound();
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        
        dog.makeSound();
        dog.eat();
        
        cat.makeSound();
        cat.eat();
    }
}
