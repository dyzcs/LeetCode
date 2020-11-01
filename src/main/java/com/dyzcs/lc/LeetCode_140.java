package com.dyzcs.lc;

import java.util.*;

/**
 * Created by Administrator on 2020/11/1.
 */
public class LeetCode_140 {
    public static void main(String[] args) {
        SolutionLC140 solutionLC140 = new SolutionLC140();
        String s1 = "catsanddog";
        String[] ss1 = {"cat", "cats", "and", "sand", "dog"};
        List<String> list1 = new ArrayList<>(Arrays.asList(ss1));
        List<String> r1 = solutionLC140.wordBreak(s1, list1);
        for (String s : r1) {
            System.out.println(s);
        }

        System.out.println();

        String s2 = "pineapplepenapple";
        String[] ss2 = {"apple", "pen", "applepen", "pine", "pineapple"};
        List<String> list2 = new ArrayList<>(Arrays.asList(ss2));
        List<String> r2 = solutionLC140.wordBreak(s1, list2);
        for (String s : r2) {
            System.out.println(s);
        }

        System.out.println();

        String s3 = "catsandog";
        String[] ss3 = {"cats", "dog", "sand", "and", "cat"};
        List<String> list3 = new ArrayList<>(Arrays.asList(ss3));
        List<String> r3 = solutionLC140.wordBreak(s1, list3);
        for (String s : r3) {
            System.out.println(s);
        }
    }
}

class SolutionLC140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<List<String>>> map = new HashMap<>();
        List<List<String>> wordBreaks = backtrack(s, s.length(), new HashSet<>(wordDict), 0, map);
        List<String> breakList = new LinkedList<>();
        for (List<String> wordBreak : wordBreaks) {
            breakList.add(String.join(" ", wordBreak));
        }
        return breakList;
    }

    public List<List<String>> backtrack(String s, int length, Set<String> wordSet, int index, Map<Integer, List<List<String>>> map) {
        if (!map.containsKey(index)) {
            List<List<String>> wordBreaks = new LinkedList<>();
            if (index == length) {
                wordBreaks.add(new LinkedList<>());
            }
            for (int i = index + 1; i <= length; i++) {
                String word = s.substring(index, i);
                if (wordSet.contains(word)) {
                    List<List<String>> nextWordBreaks = backtrack(s, length, wordSet, i, map);
                    for (List<String> nextWordBreak : nextWordBreaks) {
                        LinkedList<String> wordBreak = new LinkedList<>(nextWordBreak);
                        wordBreak.offerFirst(word);
                        wordBreaks.add(wordBreak);
                    }
                }
            }
            map.put(index, wordBreaks);
        }
        return map.get(index);
    }
}