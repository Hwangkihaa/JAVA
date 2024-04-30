package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String Name = scanner.nextLine();

            if(Name.equals("종료")) {
                System.out.println("종료");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            String Age = scanner.nextLine();

            System.out.println("입력한 이름 : " + Name + ", 나이 : " + Age);



        }

    }
}
