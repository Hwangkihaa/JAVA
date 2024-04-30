package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int num = scanner.nextInt();
            if(num==1)
            {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String Name = scanner.nextLine();
                System.out.print("가격을입력하세요 : ");
                int Price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int count = scanner.nextInt();
                totalCost += Price*count;
                System.out.println("상품명 : " + Name + " 가격 : " + Price + " 합계 : " + Price*count);
            }
            else if(num==2)
            {
                System.out.println("총 비용 : " + totalCost);
                totalCost=0;
            }
            else if(num==3)
            {
                System.out.println("종료");
                break;
            }
            else
                System.out.println("다시 입력");
        }
    }
}
