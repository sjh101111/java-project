package lectureCode.lecture20240216.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "qwer");
        map.put("sumer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner scanner = new Scanner(System.in);    // 키보드로 부터 입력된 내용을 받기 위해 생성

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.println("아이디: ");
            String id = scanner.nextLine();        // 키보드로 입력한 아이디를 읽는다

            System.out.println("비밀번호: ");
            String password = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                //pw 체크
                if (map.getOrDefault(id, "").equals(password)) {
                    System.out.println("로그인이 되었습니다,");
//                    break;
//                    break는 while 조건절 밖을 빠져나가서 sout까지 실현 하지만
                    //return은 값을 반환하고 메서드 종료
                    //void메서드라서 무언가를 반환하지는 않지만 메서드를 빠져나가기 위해 사용
                    return;
                } else {
                    System.out.println("패스워드 틀림");
                }
            } else {
                System.out.println("일치하는 아이디 없음");
            }
        }
    }
}
