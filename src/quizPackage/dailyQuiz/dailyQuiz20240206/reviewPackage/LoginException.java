package quizPackage.dailyQuiz.dailyQuiz20240206.reviewPackage;

public class LoginException extends Exception {
    public LoginException() {
        this("LoginException");
    }
    public LoginException(String message) {
        super(message);
    }

}
