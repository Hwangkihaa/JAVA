package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수 입력 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int min, max;

        System.out.println(n + "개의 정수 입력 : ");
        for(int i = 0; i<n; i++)
            numbers[i] = scanner.nextInt();

        min = numbers[0];
        max = numbers[0];

        for(int i = 1; i<n; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
