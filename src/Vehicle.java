// Vehicle.java
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Double price;

    public Vehicle(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // 모든 차량이 가지고 있지만, 방식이 다른 두 가지 기능
    public abstract void startEngine();
    public abstract void stopEngine();


    public void displayInfo() {
        System.out.println("브랜드: " + brand + ", 모델: " + model + ", 가격: " + price);
    }

}
