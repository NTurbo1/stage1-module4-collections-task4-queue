package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(11, new ReverseStringComparator());
        List<String> reversedTotal = new ArrayList<>(firstList);
        reversedTotal.addAll(secondList);

        priorityQueue.addAll(reversedTotal);

        return priorityQueue;
    }
}

class ReverseStringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
