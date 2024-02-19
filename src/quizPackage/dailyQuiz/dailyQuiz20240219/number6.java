package quizPackage.dailyQuiz.dailyQuiz20240219;

import java.util.function.ToIntFunction;

public class number6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };

    /*  avg() 메소드 작성
     */
    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.applyAsInt(student); // 각 학생의 점수를 가져와 더함
        }
        return (double) sum / students.length; // 총합을 학생 수로 나누어 평균 계산
    }

    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore() );
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg( s -> s.getMathScore() );
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
