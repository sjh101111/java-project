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
        } return answer;
    }
}
