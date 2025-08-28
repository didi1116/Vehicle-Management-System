import java.util.Scanner;

public class Vihicle_system_app {
    public static void main(String[] args) {
        String brand;
        String model;
        Double price;
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to Vihicle System App");
        System.out.println("Enter your brand.");
        brand = input.nextLine();
        System.out.println("Enter your model.");
        model = input.nextLine();
        System.out.println("Enter your price.");
        price = input.nextDouble();

        car c = new car(brand, model, price);

        c.displayInfo();

    }
}
