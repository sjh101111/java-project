package quizPackage.weeklyQuiz.week3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            int input = scanner.nextInt();

            if (input == 1) {

                System.out.print("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("회사명을 입력하세요: ");
                String company = scanner.next();

                Contact businessContact = new BusinessContact(name, phoneNumber, company);
                contacts.add(businessContact);
            } else if (input == 2) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.next();
                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.next();
                System.out.print("관계을 입력하세요: ");
                String relationship = scanner.next();

                Contact personalContact = new PersonalContact(name, phoneNumber, relationship);
                contacts.add(personalContact);
            } else if (input == 3) {
                for (int i = 0; i < contacts.size(); i++) {
                    Contact contact = contacts.get(i);
                    String user = contact.toString();
                    System.out.println(user);
                }
            } else if (input == 4) {
                System.out.println("검색할 이름을 입력하세요: ");
                String inputName = scanner.next();
                for (int i = 0; i < contacts.size(); i++) {
                    Contact contact = contacts.get(i);
                    if (contact.getName().equals(inputName)) {
                        String user = contact.toString();
                        System.out.println(user);
                    }
                }
            } else if (input == 5) {
                break;
            }
        }
    }
}