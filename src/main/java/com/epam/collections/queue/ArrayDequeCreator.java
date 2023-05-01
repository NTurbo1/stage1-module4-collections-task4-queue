package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combination = new ArrayDeque<>();

        combination.add(firstQueue.poll());
        combination.add(firstQueue.poll());
        combination.add(secondQueue.poll());
        combination.add(secondQueue.poll());

        while (firstQueue.size() > 0 || secondQueue.size() > 0) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(combination.removeLast());
                combination.addLast(firstQueue.poll());
                combination.addLast(firstQueue.poll());
            }

            if (!secondQueue.isEmpty()) {
                secondQueue.add(combination.removeLast());
                combination.addLast(secondQueue.poll());
                combination.addLast(secondQueue.poll());
            }
        }

        return combination;
    }
}
