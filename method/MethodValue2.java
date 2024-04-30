package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);
        changeNumber(number);
        System.out.println(number);

    }

    public static void changeNumber(int number)
    {
        System.out.println(number);
        number = number * 2;
        System.out.println(number);

    }
}
