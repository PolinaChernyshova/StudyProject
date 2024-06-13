package Lesson_13;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayWords {
    public static void main(String[] args) {
        String[] arrayWords = {"овчарка", "бигль", "спаниель", "пудель", "бигль",
                "мальтипу", "болонка", "спаниель", "бордосский дог", "ретривер",
                "ретривер", "спаниель", "овчарка", "кокапу", "корги"};
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : arrayWords) {
            uniqueWords.add(word);
        }
        System.out.println("Список уникальных слов:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : arrayWords) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Количество повторений каждого слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
