// 양수와 음수 및 0을 판별하는 프로그램
// 결과 출력 후 입력 대기 상태로 유지

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        while(true){
            System.out.println("숫자 입력 : ");
            int number = stdin.nextInt();

            if(number>0){
                System.out.println("양수");
            }
            else if(number<0){
                System.out.println("음수");
            }
            else{
                System.out.println('0');
            }
        }
    }
}
