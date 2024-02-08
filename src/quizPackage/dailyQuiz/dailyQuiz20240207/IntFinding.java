package quizPackage.dailyQuiz.dailyQuiz20240207;

public class IntFinding {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length - 1; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break; // break;로 값 확실히 return
            } else {
                answer = 0;
            }
        } return answer; // int answer랑 else구문 없애도 0과 1만 리턴하기 때문에 상관없다
    }                    // 어짜피 처음에 answer에 0을 할당했기 때문에 else구문 필요 없음
}                        // 아니면 answer선언안하고 if문에서 return 1, if문나와서 return 0
