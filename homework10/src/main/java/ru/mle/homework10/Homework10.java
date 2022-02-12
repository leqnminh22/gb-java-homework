package ru.mle.homework10;

import java.util.*;

public class Homework10 {

    /**
     1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     айти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     Посчитать, сколько раз встречается каждое слово.
     */

    public static void main(String[] args) {

        String[] words = {"Minecraft","FFXIV","FFXIV","Minecraft","Minecraft","DOTA","CSGO","DOTA","CSGO","CSGO","FallOut","FallOut",};
        uniqueWords(words);
    }

    public static void uniqueWords(String[] words) {

        List<String> word = new ArrayList<>(Arrays.asList(words));
        System.out.println("Исходный список: " + word);

        System.out.println("\nКол-во повторов каждого слова в списке: " );
        Map<String, Integer> wordsCounter = new HashMap<>();

        for (String a: word) {
            wordsCounter.put(a, wordsCounter.getOrDefault(a, 0) + 1);
        }

        for(Map.Entry<String, Integer> e: wordsCounter.entrySet()) {
            System.out.println(e.getKey() +": " + e.getValue());
        }

        System.out.println("\nСписок без повторов: ");
        Set<String> uniqueWords = new HashSet<>(word);
        System.out.println(uniqueWords);
    }

}


