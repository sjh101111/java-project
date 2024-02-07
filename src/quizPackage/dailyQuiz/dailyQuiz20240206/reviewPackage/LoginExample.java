package quizPackage.dailyQuiz.dailyQuiz20240206.reviewPackage;
//login method에서 id, password 인자 모두에 대해 예외처리 메시지 출력하기

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "54321");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws LoginException {
        StringBuilder errors = new StringBuilder();

        if (!id.equals("blue")) {
            errors.append("아이디가 존재하지 않습니다.\n"); // Adding error message for ID
        }

        if (!password.equals("12345")) {
            errors.append("잘못된 비밀번호입니다.\n"); // Adding error message for password
        }

        if (errors.length() > 0) {
            throw new LoginException(errors.toString().trim()); // Throw exception with all accumulated errors
        } // StringBulider 참조 변수를 String으로 변환하고 trim을 통해 불필요한 공백 및 개행 제거
    }
}
