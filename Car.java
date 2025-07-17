import java.util.Scanner;

public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void display() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cars do you want to create? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            short year = scanner.nextShort();

            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); 

            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\n--- Car Information ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars[i].display();
            System.out.println();
        }

        scanner.close();
    }
}
