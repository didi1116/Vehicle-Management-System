import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class Vihicle_system_app {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                List<Vehicle> vehicles = new ArrayList<>();

                System.out.println("차량 관리 시스템을 시작합니다.");
                while (true) {
                    System.out.println("\n어떤 종류의 차량을 추가하시겠습니까?");
                    System.out.println("1. 자동차  2. 트럭  3. 오토바이  4. 종료 및 목록 출력");
                    System.out.print("선택: ");
                    String choice = scanner.nextLine();

                    if (choice.equals("4")) {
                        break;
                    }

                    System.out.print("브랜드를 입력하세요: ");
                    String brand = scanner.nextLine();
                    System.out.print("모델을 입력하세요: ");
                    String model = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            vehicles.add(new Car(brand, model));
                            System.out.println("자동차 정보가 추가되었습니다.");
                            break;
                        case "2":
                            vehicles.add(new Truck(brand, model));
                            System.out.println("트럭 정보가 추가되었습니다.");
                            break;
                        case "3":
                            vehicles.add(new Motorcycle(brand, model));
                            System.out.println("오토바이 정보가 추가되었습니다.");
                            break;
                        default:
                            System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                    }
                }

                System.out.println("\n--- 전체 차량 목록 및 기능 실행 ---");
                if (vehicles.isEmpty()) {
                    System.out.println("등록된 차량이 없습니다.");
                } else {
                    // 다형성을 활용하여 각 차량의 정보를 출력하고 시동을 겁니다.
                    for (Vehicle vehicle : vehicles) {
                        vehicle.displayInfo();
                        vehicle.startEngine();
                        System.out.println("--------------------");
                    }
                }

                scanner.close();
            }
        }



