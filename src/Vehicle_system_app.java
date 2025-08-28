import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle_system_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("\n어떤 종류의 차량을 추가하시겠습니까?");
            System.out.println("1. 자동차 | 2. 트럭 | 3. 오토바이 | 4. 종료 및 목록 출력");
            System.out.print("선택: ");
            String choice = input.nextLine();
            if (choice.equals("4")) {
                break;
            }

            System.out.print("브랜드 입력: ");
            String brand = input.nextLine();
            System.out.print("모델 입력: ");
            String model = input.nextLine();
            System.out.print("가격 입력: ");
            String priceString = input.nextLine();
            Double price = 0.0;
            try {
                System.out.print("가격 입력: ");
                price = Double.parseDouble(priceString);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ 가격은 숫자만 입력해주세요.");
                break;
            }

            switch (choice) {
                case "1":
                    vehicles.add(new car(brand, model, price));
                    System.out.println("자동차 정보가 추가되었습니다.");
                    break;
                case "2":
                    vehicles.add(new truck(brand, model, price));
                    System.out.println("트럭 정보가 추가되었습니다.");
                    break;
                case "3":
                    vehicles.add(new motorcycle(brand, model, price));
                    System.out.println("오토바이 정보가 추가되었습니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }

        System.out.println("\n=== 전체 차량 목록 및 기능 실행 ===");

        if (vehicles.isEmpty()) {
            System.out.println("등록된 차량이 없습니다.");
        }
        else {
            for (Vehicle vehicle : vehicles) {
                System.out.println("---------------------------------");
                vehicle.displayInfo();
                vehicle.startEngine(); //다형성
                vehicle.stopEngine(); //다형성
            }

        }
        input.close();
    }
}