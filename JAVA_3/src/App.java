// 1. 정수 한개를 입력 받아서, 입력한 수가 3의 배수 또는 2의 배수,
// 아니면 2와 3의 배수, 2와 3의 배수가 아닌지 판단해 출력

import java.util.Scanner;
public class App {
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("한 개의 정수 입력 : ");
        int a = stdin.nextInt();
        if(a%6==0)
        {
            System.out.println("2와 3의 배수");
        }
        else if(a%2==0)
        {
            System.out.println("2의 배수");
        }
        else if(a%3==0)
        {
            System.out.println("3의 배수");
        }
        else if(a%3!=0)
        {if(a%2!=0)
            System.out.println("2와 3의 배수가 아님");
        }
    }
}


// 2. 사용자에게 0과 100 사이의 점수를 입력받아 80점 이상이면 합격,
// 60점 이상 재시험, 60점 미만 불합격 출력.
// 입력한 점수가 범위에 맞지 않으면 에러 메시지 출력

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = stdin.nextInt();

        if(score<0)
        {
            System.out.println("범위 아님");
        }
        if(score>100)
        {
            System.out.println("범위 아님");
        }
        else if(score<=100 && score>80)
        {
            System.out.println("합격");
        }
        else if(score<80 && score>=60)
        {
            System.out.println("재시험");
        }
        else if(score<60)
        {
            System.out.println("불합격");
        }
    }
}


// 3. 세 개의 정수를 입력 받아, 입력 받은 수들의 최댓값, 최솟값, 합계, 평균 출력

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("3개의 정수 입력 : ");
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        
        int max=a;
        int min=b;
        int sum = a+b+c;
        double avg = sum/3.0;

        if (max < b) max = b;
        if (max < c) max = c;   

        if (min > b) min = b;
        if (min > c) min = c;

        String msg = "최대값: " + max +
        "\n최소값: " + min +
        "\n합계: " + sum +
        "\n평균: " + String.format("%.1f", avg);

         System.out.println(msg);
    }
}


// 4. 구입할 사과의 개수 입력 받아, 입력 총 개수에 따라 개당 사과의 가격이 달라진다.
// 10개 미만 일 경우 개당 1,200원, 40개 미만일 경우 1,000원, 그 이상일 경우 800원.
// 이에 따른 총 결제액 출력

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("구입할 사과의 개수 입력 : ");
        int a = stdin.nextInt();

        if(a<10)
        {
            System.out.println(1200*a);
        }
        else if(a>=10 && a<40)
        {
            System.out.println(1000*a);
        }
        else if(a>=40)
        {
            System.out.println(800*a);
        }
    }
}