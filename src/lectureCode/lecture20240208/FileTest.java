package lectureCode.lecture20240208;

public class FileTest {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir");
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            inputStream.read();
            inputStream.close();
            System.out.println("test");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("에러");
        }
    }
}
