import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Choose an animal (1 = Animal, 2 = Dog, 3 = Cat): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                animal.makeSound();
                break;
            case 2:
                dog.makeSound();
                break;
            case 3:
                cat.makeSound();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
