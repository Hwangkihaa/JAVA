// 구구단 프로그램 만들기
// 1을 입력하면 홀수 단(1,3,5,7), 2를 입력하면 짝수 단(2,4,6,8), 3을 입력하면 종료
// 그 외의 숫자를 입력하면 다시 입력하도록 하는 프로그램

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while(true) {
            System.out.println("1. 홀수 단 출력");
            System.out.println("2. 짝수 단 출력");
            System.out.println("3. 종료");
            System.out.print("번호 선택 : ");
            
            int number = stdin.nextInt();

            switch (number) {
                case 1:
                    System.out.println("홀수 단 출력");
                    for(int i=1; i<=9; i+=2){
                        for(int j=1; j<=9; j++){
                            System.out.println(i + "*" + j + "=" + (i*j) );
                        }
                        System.out.println();
                    }
                    break;
            
                case 2:
                    System.out.println("짝수 단 출력");
                    for(int i=2; i<=8; i+=2){
                        for(int j=1; j<=9; j++){
                            System.out.println(i + "*" + j + "=" + (i*j) );
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.println("종료");
                    stdin.close();
                
                default :
                    System.out.println("다시 입력 !");
            }
        }
    }
}
