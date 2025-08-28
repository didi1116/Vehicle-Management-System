// Car.java
class car extends Vehicle {
    public car(String brand, String model, Double price) {
        super(brand, model, price);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + "의 시동을 켜고 달립니다.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + "의 시동을 끕니다.");
    }
}