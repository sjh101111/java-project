package lectureCode.lecture20240220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // null이 아닌 값을 갖는 Optional 객체 반환
//        String str = null;
//        Optional<String> of = Optional.of(str);

//        String str = null;


// null을 허용하는 Optional 객체 반환
        Optional<String> nullableOpt = Optional.ofNullable(null);

//        String ofStr = nullableOpt.get();
        String returnStr = nullableOpt.orElse("default value");
        System.out.println(returnStr);

        Optional<List<String>> optionalStringList = Optional.ofNullable(null);
        if (optionalStringList.isPresent()) {
            List<String> stringList = optionalStringList.orElse(Arrays.asList());
        }
    }
}
