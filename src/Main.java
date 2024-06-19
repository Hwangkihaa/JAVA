import io.FileManager;
import manager.ExpenseManager;
import item.ExpenseItem;
import network.NetworkManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("1. 항목 추가");
            System.out.println("2. 항목 삭제");
            System.out.println("3. 전체 항목 보기");
            System.out.println("4. 파일로 저장하기");
            System.out.println("5. 저장된 파일 불러오기");
            System.out.println("6. 데이터 전송");
            System.out.println("7. 데이터 수신");
            System.out.println("8. 종료");
            System.out.print("원하시는 번호를 선택해주세요 : ");

            int choice = scanner.nextInt();  // 사용자로부터 메뉴 선택을 입력받음
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // 용돈 항목 추가
                    System.out.print("날짜 (YYYY-MM-DD) : ");
                    String date = scanner.nextLine();
                    System.out.print("내용 : ");
                    String description = scanner.nextLine();
                    System.out.print("금액 : ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("수입/지출 선택 입력 (수입/지출) : ");
                    String incomeInput = scanner.nextLine();
                    boolean isIncome = incomeInput.equalsIgnoreCase("수입");
                    manager.addItem(new ExpenseItem(date, description, amount, isIncome));
                    double total = manager.calculateTotal();
                    System.out.println("총합 : " + total);
                    break;
                case 2:
                    // 용돈 항목 제거
                    System.out.print("삭제할 항목 번호 입력 (1부터 시작) : ");
                    int index = scanner.nextInt();
                    manager.removeItem(index-1);
                    break;
                case 3:
                    // 용돈 항목 표시
                    manager.displayItems();
                    break;
                case 4:
                    // 파일에 저장
                    System.out.print("저장할 파일의 이름 입력 : ");
                    String filename = scanner.next();
                    try {
                        FileManager.saveToFile(filename, manager.getItems());
                    } catch (IOException e) {
                        System.out.println("파일 저장하기 오류 : " + e.getMessage());
                    }
                    break;
                case 5:
                    // 저장된 파일에서 불러오기
                    System.out.print("불러올 파일의 이름 : ");
                    filename = scanner.next();
                    try {
                        manager.items = FileManager.loadFromFile(filename);
                    } catch (IOException e) {
                        System.out.println("파일 불러오기 오류 : " + e.getMessage());
                    }
                    break;
                case 6:
                    // 네트워크로 데이터 송신
                    System.out.print("호스트 이름 입력 : ");
                    String hostname = scanner.next();
                    try {
                        NetworkManager.sendData(hostname, manager.getItems());
                    } catch (IOException e) {
                        System.out.println("데이터 전송 오류 : " + e.getMessage());
                    }
                    break;
                case 7:
                    // 네트워크로 데이터 수신
                    try {
                        manager.items = NetworkManager.receiveData();
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("데이터 수신 오류 : " + e.getMessage());
                    }
                    break;
                case 8:
                    // 프로그램 종료
                    System.out.println("종료 !");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 번호를 다시 입력해주세요.");
            }
        }
    }
}