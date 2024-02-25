package quizPackage.weeklyQuiz.week5MiddelTest.getAreaOfShapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,5);
        Triangle triangle = new Triangle(5,5);

        circle.getArea();
        rectangle.getArea();
        triangle.getArea();
    }
}
