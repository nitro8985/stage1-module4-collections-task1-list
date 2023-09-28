package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> processed = new LinkedList<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                processed.addLast(num);
            } else {
                processed.addFirst(num);
            }
        }
        return processed;
    }
}
