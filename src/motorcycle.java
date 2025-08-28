public class motorcycle extends Vehicle {
    public motorcycle (String brand, String model, Double price) {
        super (brand, model, price);
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
