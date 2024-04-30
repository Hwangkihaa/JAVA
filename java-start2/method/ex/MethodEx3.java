package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원 입금, 현재 잔액 : " + balance );
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance>=amount)
        {
            balance -=amount;
            System.out.println(amount + "원 출금, 현재 잔액 : " + balance);
        }
        else{
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
