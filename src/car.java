// Car.java
class car extends Vehicle  implements ElectricVehicle, FuelVehicle{

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

    @Override
    public void charge() {
        System.out.println("배터리를 충전합니다.");
    }

    @Override
    public void refuel() {
        System.out.println("기름을 주유합니다.");
    }
}
