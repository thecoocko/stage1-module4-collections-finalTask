package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> newMap = new HashMap<>();

        for(Map.Entry<String,Integer> entry : sourceMap.entrySet()){
            Set<String>setForMap = newMap.getOrDefault(entry.getKey().length(), new HashSet<>());
            setForMap.add(entry.getKey());
            newMap.put(entry.getKey().length(),setForMap);
        }

        return newMap;
    }


}
