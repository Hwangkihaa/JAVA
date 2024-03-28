// 1. 정수를 입력 받아 출력하기
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("한 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        System.out.printf("%d", a);
    }
}



// 2. 두 정수를 입력 받아 출력하기
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        System.out.printf("%d %d", a, b);
    }
}


// 3. 두 정수를 입력 받아 변수에 저장하고 출력하기
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        System.out.println(a);
        System.out.println(b);
    }
}


// 4. 두 정수를 입력 받아 줄 바꿈 없이 출력하기
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        System.out.print(a);
        System.out.println(b);
    }
}


// 5. 두 정수를 입력 받아 변수에 저장하고, 저장된 두 변수의 값을 교환 후 출력하기
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        System.out.println(b);
        System.out.println(a);
    }
}


// 6. 정수를 입력 받아 비트 왼쪽 시프트 연산하기
import java.util.Scanner;
public class App {
    public static void main(String args[]) 
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("한 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        System.out.println("   a<<2 = " +(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
    }
}


// 7. 정수를 입력받아 비트 오른쪽 시프트 연산하기
import java.util.Scanner;
public class App {
    public static void main(String args[]) 
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("한 개의 정수를 입력 : ");
        int a = stdin.nextInt();
        System.out.println("   a>>2 = " +(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
    }
}