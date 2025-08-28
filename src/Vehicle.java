abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Double price;

    public Vehicle(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    abstract void startEngine();
    abstract void stopEngine();
}
