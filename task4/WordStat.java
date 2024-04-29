package midterm.tekla_jikhvashvili_2.task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Set to store all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print unique words to console
        System.out.println("Set of all different words:");
        uniqueWords.forEach(System.out::println);

        // Write unique words to file
        writeToFile("task4.txt", "Set of all different words:", uniqueWords);

        // Map to store word length and its count
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print word length map to console
        System.out.println("\nWord length map:");
        wordLengthMap.forEach((length, count) -> System.out.println("Length " + length + ": " + count));

        // Write word length map to file
        writeToFile("task4.txt", "\n\nWord length map:", wordLengthMap);
    }

    private static void writeToFile(String fileName, String header, Collection<String> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(header);
            writer.newLine();
            for (String item : data) {
                writer.write(item);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String fileName, String header, Map<?, ?> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(header);
            writer.newLine();
            for (Map.Entry<?, ?> entry : data.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
