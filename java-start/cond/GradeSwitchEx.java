package cond;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String Grade = "C";

        switch (Grade){
            case "A" :
                System.out.println("탁월한 성과입니다.");
                break;
            case "B" :
                System.out.println("좋은 성과입니다.");
                break;
            default:
                System.out.println("불합격");
                break;
        }
    }
}
