package quizPackage.dailyQuiz.dailyQuiz20240206;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
