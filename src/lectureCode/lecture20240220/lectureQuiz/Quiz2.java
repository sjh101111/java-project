package lectureCode.lecture20240220.lectureQuiz;

import lectureCode.lecture20240201.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz2 {
    public static class Member {
        private String name;
        private String favoriteColor;
        private int age;

        public Member(String name, String favoriteColor, int age) {
            this.name=name;
            this.age=age;
            this.favoriteColor=favoriteColor;
        }

        public String getName() {
            return name;
        }

        public String getFavoriteColor() {
            return favoriteColor;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Person {
        private String name;
        private int age;

        public  Person(String name, int age) {
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(new Member("a","a",1));

        List<Person> personList = memberList.stream()
                .map(member -> new Person(member.getName(),member.getAge()))
                .collect(Collectors.toList());
        personList.forEach(System.out::println);
    }


}
