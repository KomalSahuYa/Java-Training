package question_1;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "").trim();
                if (line.isEmpty()) continue;

                String[] words = line.split("\\s+");
                for (String word : words) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
