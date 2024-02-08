package lectureCode.lecture20240208;
import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String filepath = System.getProperty("user.dir")+ "/src/text.txt";
//        System.out.println(System.getProperty("user.dir"));
        try (BufferedReader br = new BufferedReader(new FileReader(filepath));
             BufferedWriter wr = new BufferedWriter(new FileWriter(filepath))
        ) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("예외처리 로직");
        }


//        BufferedReader br = null;
//        System.getProperty("user.dir");
//        try {
//            br = new BufferedReader(new FileReader(filepath));
////            br.readLine();
//            System.out.println(br.readLine());
//            br.close();
//        } catch (FileNotFoundException e) {
//            // FileNotFoundException 발생 예외 처리
//        } catch (IOException e) {
//            // IOException 발생 예외 처리
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    // 예외처리
//                }
//            }
//        }
    }
}
