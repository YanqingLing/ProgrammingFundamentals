package com.ling.datastructure;

import com.sun.source.tree.Tree;

import java.util.*;

public class FinalWordCount {
    static HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        lines.add("Nothing is so necessary for a young man as the company of intelligent women.");
        lines.add("The strongest of all warriors are these two — Time and Patience.");
        lines.add("If everyone fought for their own convictions there would be no war.");
        lines.add("There is no greatness where there is not simplicity, goodness, and truth.");
        lines.add("A limit has been set to human life, which cannot be overstepped");
        lines.add("Well, what makes you go to war?");

        WordCount countWords = new WordCount();
        ArrayList<String> allWords = new ArrayList<>();

        for(String line : lines) {
            String[] words = line.split("\\W+");
            for(String word : words) {
                allWords.add(word);
            }
        }

        //Print all the words found alphabetically
        TreeSet<String> sorted = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        sorted.addAll(allWords);
        System.out.println(sorted);

        //Print the first and last word
        System.out.println(allWords.get(0));
        System.out.println(allWords.get(allWords.size()-1));

        //Print all the unique words ignoring case - don’t sort it
        HashSet<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(allWords);
        System.out.println(uniqueWords);




    }

    //Print the total number of words found
    public Integer wordCount(ArrayList<String> lines) {
        int sum = 1;
        for(String line : lines) {
            String[] words = line.split("\\W+");
            sum = sum + words.length;
        }
        return sum;
    }

    //Generate the count for each word and store the count for each word as HashMap. The number of occurrences for each word
    public HashMap<String, Integer> countsOfEachWord(ArrayList<String> allWords) {
        for(String word: allWords) {
            if (wordsHashMap.containsKey(word)) {
                wordsHashMap.put(word, wordsHashMap.get(word) + 1);
            } else {
                wordsHashMap.put(word, 1);
            }
        }
        return wordsHashMap;
    }








}
