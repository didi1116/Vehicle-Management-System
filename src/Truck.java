// Truck.java
class Truck extends Vehicle implements ElectricVehicle, FuelVehicle{
    public Truck(String brand, String model, Double price) {
        super(brand, model, price);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + "의 강력한 엔진 시동을 켜고 출발합니다.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + "의 엔진을 정지합니다.");
    }

    @Override
    public void refuel() {
        System.out.println("기름을 주유합니다.");
    }
    @Override
    public void charge() {
        System.out.println("배터리를 충전합니다.");
    }
}