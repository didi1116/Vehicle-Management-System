public class motorcycle extends Vehicle {
    public motorcycle (String brand, String model, Double price) {
        super (brand, model, price);
    }
    public void startEngine(){
        System.out.println("Engine is started");
    }
    public void stopEngine(){
        System.out.println("Engine is stopped");
    }

}
