package quizPackage.dailyQuiz.dailyQuiz20240212;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
        int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.println("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.println("회사명을 입력하세요: ");
                String company = scanner.next();

                Contact BusinessContact = new BusinessContact(name, phoneNumber, company);

            } else if (input == 2) {
                System.out.println("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.println("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.println("관계을 입력하세요: ");
                String relationship = scanner.next();

            } else if (input == 3) {


            } else if (input == 4) {
                System.out.println("검색할 이름을 입력하세요");
                String name = scanner.next();


            } else if (input == 5) {
                break;
            } else {
                System.out.println("올바른 숫자를 입력해주세요");
            }
        }
    }
}
