package quizPackage.weeklyQuiz.week5MiddelTest.getAreaOfShapes;

public class Rectangle implements Shape {
    private int width;
    private int length;
    private int area;
    public Rectangle (int width, int length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public void getArea() {
       area =  this.width * this.length;
        System.out.println(area);
    }
}
