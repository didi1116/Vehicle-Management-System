public class truck extends Vehicle{
    public truck(String brand, String model, double price){
        super (brand, model, price);b
    }
    public void startEngine(){
        System.out.println("Engine is started");
    }
    public void stopEngine(){
        System.out.println("Engine is stopped");
    }
}
