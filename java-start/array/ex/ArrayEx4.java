package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        int sum =0;
        double avg;

        System.out.println("5개의 정수를 입력하세요 : ");
        for(int i = 0; i<5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        avg =(double) sum/5;
        System.out.println(sum);
        System.out.println(avg);
    }
}
