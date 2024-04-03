// 원하는 숫자만큼 (*)을 하나씩 줄여가며 출력

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("별의 개수 입력 : ");
        int number = stdin.nextInt();

        for(int i=number; i>=1; i--){
            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
