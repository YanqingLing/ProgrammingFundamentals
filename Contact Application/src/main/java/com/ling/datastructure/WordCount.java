package com.ling.datastructure;

import java.util.*;


public class WordCount {
    static HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();
    TreeMap<String, Integer> sortedMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);


    public static void main(String[] args) {



        ArrayList<String> lines = new ArrayList<String>();
        lines.add("Nothing is so necessary for a young man as the company of intelligent women.");
        lines.add("The strongest of all warriors are these two — Time and Patience.");
        lines.add("If everyone fought for their own convictions there would be no war.");
        lines.add("There is no greatness where there is not simplicity, goodness, and truth.");
        lines.add("A limit has been set to human life, which cannot be overstepped");
        lines.add("Well, what makes you go to war?");

        WordCount methods = new WordCount();
        /*System.out.println(methods.wordCount(lines));
        System.out.println();
        System.out.println(methods.countsOfEachWord(lines));
        System.out.println();
        methods.printOutAlphabetically(wordsHashMap);
        System.out.println();
        methods.printFirstAndLastWord(wordsHashMap);
        System.out.println();
        methods.printAllTheUniqueWord(wordsHashMap);*/
        System.out.println(methods.getAllWords(lines));



    }


    //Print the total number of words found
    public Integer wordCount(ArrayList<String> lines) {
        int sum = 0;
        for(String line : lines) {
            String[] words = line.split("\\W+");
            sum = sum + words.length;
        }
        return sum;
    }

    //Generate the count for each word and store the count for each word as HashMap
    //static HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();
    public ArrayList<String> getAllWords(ArrayList<String> lines) {
        ArrayList<String> allWords = new ArrayList<>();
        for(String line : lines) {
            String[] words = line.split("\\W+");
            for(String word : words) {
                allWords.add(word);
            }
        }
        return allWords;
    }

    public HashMap<String, Integer> countsOfEachWord(ArrayList<String> lines) {

        for (String line : lines) {
            String[] words = line.split("\\W+");
            for (String word : words) {
                if (wordsHashMap.containsKey(word)) {
                    wordsHashMap.put(word, wordsHashMap.get(word) + 1);
                } else {
                    wordsHashMap.put(word, 1);
                }
            }

        }
        return wordsHashMap;

    }

    //Print all the words found Alphabetically

    public void printOutAlphabetically(HashMap<String, Integer> wordsHashMap) {
        sortedMap.putAll(wordsHashMap);
        sortedMap.forEach((k, v) -> {
            System.out.println("key: " + k + ", value: " + v);
        });

    }

    public void printFirstAndLastWord(HashMap<String, Integer> wordsHashMap) {
        sortedMap.putAll(wordsHashMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
    }

    public void printAllTheUniqueWord(HashMap<String, Integer> wordsHashMap){
      for(String key : wordsHashMap.keySet()) {
          Integer value = wordsHashMap.get(key);
          if (value == 1) {
              System.out.println(key);
          }
      }



    }
}





















