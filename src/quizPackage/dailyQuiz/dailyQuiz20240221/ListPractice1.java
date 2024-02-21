package quizPackage.dailyQuiz.dailyQuiz20240221;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice1 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = Arrays.asList();
        stringList2.add("a");
        //Arrays.List로 배열의 크기가 정해진 형태의 List를 만들었기에 add를 하면 에러 발생(UnsupportOperationExceoption)
//        System.out.println(stringList2);
        //객체 추가
        Boolean add = stringList.add("a");
        String add1 = stringList.set(0, "b");
        stringList.add(1, "a");//void
        //객체검색
        boolean isElement = stringList.contains("a");
        String isElement1 = stringList.get(0);
        boolean isEmpty = stringList.isEmpty();
        int size = stringList.size();
        //객체삭제
        stringList.clear();//저장된 모든 개체 삭제
        String delete = stringList.remove(0);
        boolean delete1 = stringList.remove("a");
    }
}
