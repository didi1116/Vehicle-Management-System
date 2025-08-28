abstract class Vehicle {
    String brand;
    String model;
    Double price;

    public Vehicle(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    abstract  void startEngine();
    abstract void  stopEngine();
}
