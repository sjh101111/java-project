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
        return "Name: " + super.getName() + ", Phone: " + super.getPhoneNumber()
        + ", company: " + this.company; // Add more details as needed
    }
}
