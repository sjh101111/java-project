package quizPackage.weeklyQuiz.week3;

public class PersonalContact extends Contact {
    private String relationship;

    PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "이름: " + super.getName() + ", 전화번호: " + super.getPhoneNumber()
                + ", 관계: " + this.relationship; // Add more details as needed
    }
}
