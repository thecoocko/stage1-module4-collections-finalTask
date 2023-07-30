package com.epam.mjc.collections.combined;

import java.util.*;

/**
 * If the names of the projects are of the same length, then sort alphabetically in reverse order.*/
public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsOfDev = new ArrayList<>();

        for(Map.Entry<String,Set<String>> entry : projects.entrySet()){
            if(entry.getValue().contains(developer)==true){
                projectsOfDev.add(entry.getKey());
            }
        }

        projectsOfDev.sort((s1, s2) -> {
            int leng = Integer.compare(s1.length(), s2.length());
            if(leng==0){
                return s2.compareTo(s1);
            }else{
                return leng;
            }
        });
        projectsOfDev.sort((a, b) -> Integer.compare(b.length(), a.length()));

        return projectsOfDev;
    }

}


