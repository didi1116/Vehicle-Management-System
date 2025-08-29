// Motorcycle.java
class motorcycle extends Vehicle implements ElectricVehicle, FuelVehicle {
    @Override
    public void refuel() {
        System.out.println("기름을 주유합니다.");
    }

    @Override
    public void charge() {
        System.out.println("배터리를 충전합니다.");

    }

    public motorcycle(String brand, String model, Double price) {
        super(brand, model, price);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + "의 시동을 발로 밟아 켭니다.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + "의 시동을 끕니다.");
    }
}