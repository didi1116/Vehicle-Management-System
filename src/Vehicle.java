abstract class Vehicle {
    String brand;
    String model;
    Double price;

    public Vehicle(String brand, String model, Double price) {
    }

    abstract  void startEngine();
    abstract void  stopEngine();
}
