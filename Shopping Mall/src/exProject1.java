import java.util.Scanner;
public class exProject1 {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    static Cart mCart = new Cart();

    public static void main(String[] args) {
        Book[] mBookList = new Book[NUM_BOOK];
        Scanner input = new Scanner(System.in);
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";
        boolean quit = false;
        while (!quit) {
            System.out.println("******************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
            System.out.println("*******************************************");
            System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
            System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
            System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
            System.out.println(" 7. 영수증 표시하기 \t8. 종료");
            System.out.println("*******************************************");
            System.out.print("메뉴 번호를 선택하세요 : ");
            int n = input.nextInt();

            if(n<1 || n>9){
                System.out.println("1~9번까지 입력 가능합니다.");
            }
            else {
                switch (n) {
                    case 1 :
                        System.out.println("고객 정보 확인");
                        break;
                    case 2 :
                        System.out.println("장바구니 상품 목록 보기");
                        break;
                    case 3 :
                        System.out.println("장바구니 비우기");
                        break;
                    case 4 :
                        System.out.println("장바구니 항목 추가");
                        menuCartAddItem(mBookList);
                        break;
                    case 5 :
                        System.out.println("장바구니 항목 수량 줄이기");
                        break;
                    case 6 :
                        System.out.println("장바구니 항목 삭제");
                        break;
                    case 7 :
                        System.out.println("영수증 표시");
                        break;
                    case 8 :
                        System.out.println("종료");
                        quit = true;
                        break;
                    case 9 :
                        break;
                }
            }
        }
    }

    public static void menuCartAddItem(Book[] booklist) {
        BookList(booklist);
        mCart.printBookList(booklist);
    }

    public static void BookList(Book[] booklist) {
        booklist[0] = new Book("ISBN1234", "Java Script", 27000);
        booklist[0].setAuthor("김춘자");
        booklist[0].setDescription("java script 3.0 최신");
        booklist[0].setCategory("프로그래밍 언어");
        booklist[0].setReleaseDate("2018/10/08");

        booklist[1] = new Book("ISBN1235", "PYTHON", 33000);
        booklist[1].setAuthor("김길자");
        booklist[1].setDescription("PYTHON 중고급");
        booklist[1].setCategory("프로그래밍 언어");
        booklist[1].setReleaseDate("2022/01/22");

        booklist[2] = new Book("ISBN1234", "java", 22000);
        booklist[2].setAuthor("홍길동");
        booklist[2].setDescription("java 입문서");
        booklist[2].setCategory("프로그래밍 언어");
        booklist[2].setReleaseDate("2019/06/10");
    }
}
