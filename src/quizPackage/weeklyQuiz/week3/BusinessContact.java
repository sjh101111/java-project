package quizPackage.weeklyQuiz.week3;

public class BusinessContact extends Contact {
    private String company;

    public String getCompany() {
        return company;
    }

    BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public String toString() {
        return "이름: " + super.getName() + ", 전화번호: " + super.getPhoneNumber()
        + ", 회사: " + this.company; // Add more details as needed
    }
}
