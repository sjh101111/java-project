package quizPackage.dailyQuiz.dailyQuiz20240207;

//문제 설명
//정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전
// 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
// return하도록 solution 함수를 완성해주세요.
//입출력 예
//num_list	result
//[2, 1, 6]	[2, 1, 6, 5]
//        [5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
public class LastTwoElements {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for (int i = 0; i <= num_list.length; i++) {
            answer[i] = num_list [i];
        }
        int last = answer[num_list.length-1];
        int before = answer[num_list.length-2];
        answer[answer.length - 1]= last > before ? last -before : 2*last;
        return answer;
    }
}
