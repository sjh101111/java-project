package quizPackage.weeklyQuiz.week5MiddelTest.wordCounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordInfo {
    private String longestWord;
    private Map<String, Integer> frequency;
    int maxLength;

    public void findLongestWord(List<String> list) {
        this.maxLength = list.get(0).length();
        this.longestWord = list.get(0);
        for (String str : list) {
            if (str.length() > maxLength) {
                this.longestWord = str;
                this.maxLength = str.length();
            }
        }
        System.out.println("1. 문자열에서 가장 긴 단어 찾기 :\n" + longestWord +": "+maxLength);
    }

    public void getFrequency(List<String> list) {
        this.frequency = new HashMap<>();

        for (String str : list) {
            if (frequency.containsKey(str)) {
                frequency.put(str, frequency.get(str)+ 1);
            } else if (!frequency.containsKey(str)) {
                frequency.put(str, 1);
            }
        }
        List<Map.Entry<String, Integer>> frequencyList = new ArrayList<>(frequency.entrySet());

        frequencyList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 상위 세 개의 반복 횟수를 추출
        Set<Integer> topFrequencies = frequencyList.stream()
                .map(Map.Entry::getValue)
                .distinct()
                .limit(3)
                .collect(Collectors.toSet());

        System.out.println("");

        System.out.println("2. 문자열에서 가장 많이 나온 단어 TOP 3 :");
        // 상위 세 개의 반복 횟수에 해당하는 모든 문자열을 출력
        frequencyList.stream()
                .filter(entry -> topFrequencies.contains(entry.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

//        for (int i = 0; i < Math.min(frequencyList.size(), 3); i++) {
//            Map.Entry<String, Integer> entry = frequencyList.get(i);
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
    }

