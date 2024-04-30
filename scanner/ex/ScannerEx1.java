package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        String Name = scanner.nextLine();
        System.out.print("나이 : ");
        int Age = scanner.nextInt();

        System.out.println("당신의 이름은 "+Name+"이고, 나이는 "+Age+"살입니다.");


    }
}
