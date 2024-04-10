// Array 클래스와 System 클래스를 이용한 배열

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] array1 = {"IMF", "come", "Computer", "♣", "제주도", "123", "#"};
        System.out.println("정렬 전 데이터");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("정렬 후 데이터");
        System.out.println(Arrays.toString(array1));
        
        System.out.println("♣은 배열의"+Arrays.binarySearch(array1, "♣")+"번째 요소");

        String[] array2 = array1;
        System.out.println("array1과 array2가 같은가? : " + Arrays.equals(array1, array2));

        String[] array3 = new String[8];
        System.arraycopy(array2,0,array3,0,array2.length);
        System.out.println("array3 배열 : " + Arrays.toString(array3));
    }
}
