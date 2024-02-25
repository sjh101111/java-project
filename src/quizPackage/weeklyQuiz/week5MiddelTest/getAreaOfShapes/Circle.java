package quizPackage.weeklyQuiz.week5MiddelTest.getAreaOfShapes;

public class Circle implements Shape{

    private int radius;
    private final double pi = 3.14;
    private double area;
    public Circle(int radius) {
        this.radius = radius;;
    }
    @Override
    public void getArea() {
        area = radius * radius * pi;
        System.out.println(area);
    }
}
