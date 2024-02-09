package quizPackage.weeklyQuiz.week3;

public class PersonalContact extends Contact {
    private String relationship;

    PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Phone: " + super.getPhoneNumber()
                + ", relationship: " + this.relationship; // Add more details as needed
    }
}
