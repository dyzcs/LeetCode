package com.dyzcs.lc;

import java.util.*;

/**
 * Created by Administrator on 2020/10/31.
 */
public class LeetCode_381 {
    public static void main(String[] args) {

    }
}

class RandomizedCollection {
    Map<Integer, Set<Integer>> idx;
    List<Integer> nums;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        idx = new HashMap<>();
        nums = new ArrayList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        nums.add(val);
        Set<Integer> set = idx.getOrDefault(val, new HashSet<>());
        set.add(nums.size() - 1);
        idx.put(val, set);
        return set.size() == 1;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        return false;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return 0;
    }
}
