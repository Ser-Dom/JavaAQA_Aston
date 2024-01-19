package lesson8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "apple", "orange",
                "grape", "orange", "apple", "grape", "banana", "kiwi", "apple"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordsArray) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и колличество:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "789-000");
        phoneBook.add("Иванов", "345-000");

        System.out.println("\nТелефонный справочник:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
    }
}

