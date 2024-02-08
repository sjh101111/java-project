package quizPackage.dailyQuiz.dailyQuiz20240207;

public class CountUp {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num +1];
        if ( start_num <= end_num) {
            for (int i = 0; i <= end_num-start_num ; i++) {
                answer[i]= start_num + i;
            } //i에 start_num 할당 가능
        }
        return answer;
    }
}
