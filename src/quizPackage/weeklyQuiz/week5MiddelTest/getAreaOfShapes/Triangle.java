package quizPackage.weeklyQuiz.week5MiddelTest.getAreaOfShapes;

public class Triangle implements Shape {
    private int base;
    private int height;
    private int area;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void getArea() {
        area = this.base * this.height;
        System.out.println(area);
    }
}
