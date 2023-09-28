package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> processed = new ArrayList<>();
        if (sourceList.size() >= 3) {
            for (int i = 2; i < sourceList.size(); i += 3) {
                processed.add(sourceList.get(i));
                processed.add(sourceList.get(i));
            }
        }
        return processed;
    }
}
