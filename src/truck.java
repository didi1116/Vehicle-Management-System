public class truck extends Vehicle{
    public truck(String brand, String model, double price){
        super (brand, model, price);
    }
    @Override
    public void startEngine() {
        System.out.println(brand + " " + model + "의 강력한 엔진 시동을 켜고 출발합니다.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " " + model + "의 엔진을 정지합니다.");
    }
}
